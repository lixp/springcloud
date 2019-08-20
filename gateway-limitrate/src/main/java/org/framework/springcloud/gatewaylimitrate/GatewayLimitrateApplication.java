package org.framework.springcloud.gatewaylimitrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayLimitrateApplication {



    @Bean
    public HostAddrKeyResolver hostAddrKeyResolver() {
        return new HostAddrKeyResolver();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayLimitrateApplication.class, args);
    }

}
