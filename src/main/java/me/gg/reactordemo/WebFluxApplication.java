package me.gg.reactordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.
        reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.
        reactive.function.server.RouterFunctions.route;
import static org.springframework.web.
        reactive.function.server.ServerResponse.ok;
import static reactor.core.publisher.Mono.just;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Created by danny on 2018/12/8.
 */
@SpringBootApplication
public class WebFluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxApplication.class, args);
    }

    //在application里面注册
    @Bean
    public RouterFunction<ServerResponse> helloRouterFunction() {
//        return route(GET("/hello")
//                , serverRequest -> ServerResponse.ok().body(fromObject("HelloWorld")));

        return route(GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN))
                ,request -> ok().body(just("Hello World!中国"), String.class));
    }

}
