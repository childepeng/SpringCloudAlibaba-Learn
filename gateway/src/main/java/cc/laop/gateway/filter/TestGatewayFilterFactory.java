package cc.laop.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.RequestPath;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: create in 2021/4/1 18:56
 * @Description:
 */
@Component
public class TestGatewayFilterFactory extends AbstractGatewayFilterFactory<TestGatewayFilterFactory.Config> {

    public TestGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("paramters");
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            ServerHttpRequest req = exchange.getRequest();
            ServerHttpResponse resp = exchange.getResponse();
            RequestPath path = req.getPath();
            if (path.toString().indexOf(config.paramters) > 0) {
                return chain.filter(exchange);
            } else {
                resp.setStatusCode(HttpStatus.FORBIDDEN);
                // resp.writeAndFlushWith(Flux)
                return resp.setComplete().then();
            }
        };
    }

    public static class Config {
        private String paramters;

        public Config() {
        }

        public String getParamters() {
            return paramters;
        }

        public Config setParamters(String paramters) {
            this.paramters = paramters;
            return this;
        }
    }

}
