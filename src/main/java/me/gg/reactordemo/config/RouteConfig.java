package me.gg.reactordemo.config;

import me.gg.reactordemo.handler.HiHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

/**
 * Created by danny on 2018/12/9.
 */
@Configuration
public class RouteConfig {

    //单独注册
    @Bean
    public RouterFunction<ServerResponse> routeHi(HiHandler hiHandler) {
        return RouterFunctions.route(
                RequestPredicates.GET("/hi")
//                        .and(RequestPredicates.accept(MediaType.APPLICATION_STREAM_JSON)),
                        .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                hiHandler::Hi
        ).andRoute(POST("/hi-post"), hiHandler::HiPost);
    }

}
