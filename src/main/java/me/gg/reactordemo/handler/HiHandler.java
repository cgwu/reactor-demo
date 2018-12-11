package me.gg.reactordemo.handler;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Created by danny on 2018/12/9.
 */
@Component
public class HiHandler {
    public Mono<ServerResponse> Hi(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject("Hi , this is SpringWebFlux这是单独注册"));
    }

    public Mono<ServerResponse> HiPost(ServerRequest serverRequest) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject("Hi , POST!"));
    }
}
