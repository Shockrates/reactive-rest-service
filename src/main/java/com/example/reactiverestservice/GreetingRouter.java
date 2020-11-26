package com.example.reactiverestservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class GreetingRouter {

    @Bean
    public RouterFunction<ServerResponse> route(GreedingHandler greedingHandler){

        return RouterFunctions
                    .route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), greedingHandler::hello)
                    .andRoute(RequestPredicates.GET("/users").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        greedingHandler::users)
                    .andRoute(RequestPredicates.GET("/photos").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        greedingHandler::photos);
                        
    }
    
}
