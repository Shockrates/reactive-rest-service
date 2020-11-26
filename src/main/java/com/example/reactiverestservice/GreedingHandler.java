package com.example.reactiverestservice;

import com.example.reactiverestservice.Models.Photos;
import com.example.reactiverestservice.Models.User;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class GreedingHandler {

    GreetingWebClient gwc = new GreetingWebClient();
		


    public Mono<ServerResponse> hello(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
            .body(BodyInserters.fromValue("Hello, Spring!"));
    }

    public Mono<ServerResponse> users(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
            .body(gwc.getUsers(), User.class);
    }

    public Mono<ServerResponse> photos(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
            .body(gwc.getPhotos(), Photos.class);
    }
    
}
