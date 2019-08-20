package org.framework.springcloud.gatewaylimitrate;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Created with IntelliJ IDEA.
 * User: lixp
 * Date: 2019/8/20
 * Time: 11:18
 * Mail: lixp0915@163.com
 */
public class UriKeyResolver implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(exchange.getRequest().getURI().getPath());
    }

    public UriKeyResolver uriKeyResolver() {
        return new UriKeyResolver();
    }
}
