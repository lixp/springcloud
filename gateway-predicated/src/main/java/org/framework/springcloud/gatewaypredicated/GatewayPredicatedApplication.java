package org.framework.springcloud.gatewaypredicated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayPredicatedApplication {

//    @Bean
//    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder){
//        return builder.routes().route(
//             r -> r.path("/customer/**")
//                .filters(f -> f.filter(new RequestTimeFilter())
//                .addResponseHeader("X-RESPONSE-Default-Foo","Bar"))
//                .uri("http://httpbin.org/get")
//                .order(0)
//                .id("customer_filter_router")
//        ).build();
//    }

    @Bean
    public RequestTimeGatewayFilterFactory elapsedGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayPredicatedApplication.class, args);
    }

}
