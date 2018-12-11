package me.gg.reactordemo.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by danny on 2018/12/8.
 */
@RestController
public class FooController {

    @GetMapping("/foo")
    public String foo(){
        return "Hello,这是 this is SpringWeb";
    }

    @GetMapping("/bar")
    public Mono<String> bar(){
        return Mono.just("Hello,这是 this is Reactive SpringWebFlux");
    }

}

