package com.example.reactiverestservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.example.reactiverestservice.Models.Photos;
import com.example.reactiverestservice.Models.User;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
//import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;
import reactor.netty.tcp.TcpClient;

public class GreetingWebClient {

    List<User> users = new ArrayList<>();
    
    private WebClient webclient = WebClient.create("http://localhost:8080");
    TcpClient tcpClient = TcpClient
        .create()
        .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
        .doOnConnected(connection -> {
            connection.addHandlerLast(new ReadTimeoutHandler(5000, TimeUnit.MILLISECONDS));
            connection.addHandlerLast(new WriteTimeoutHandler(5000, TimeUnit.MILLISECONDS));
    });
             

    private WebClient webclient3 = WebClient
    .builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .defaultCookie("cookieKey", "cookieValue")
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE) 
        .defaultUriVariables(Collections.singletonMap("url", "https://jsonplaceholder.typicode.com"))
        .build();


    private Mono<String> result = webclient.get()
                                            .uri("/hello")
                                            .accept(MediaType.TEXT_PLAIN)
                                            //.exchange();
                                            .exchangeToMono(res -> res.bodyToMono(String.class));

    private Flux<Photos>photoResult =  webclient3.get()
                                            .uri("/photos")
                                            .accept(MediaType.TEXT_PLAIN)
                                            .exchangeToFlux(res -> res.bodyToFlux(Photos.class));
    
    private Flux<User>usersResult =  webclient3.get()
                                                .uri("/users")
                                                .retrieve()
                                                .bodyToFlux(User.class);
                                                // .accept(MediaType.TEXT_PLAIN)
                                                //.exchange();
                                                //.exchangeToFlux(res -> res.bodyToFlux(User.class));
                                               
                                              
                                                                                          
                                    
    public String getResult(){
        return ">> result = " + result.block();
       
    }

    public Flux<User> getUsers(){
        //return ">> result = " + result.block();
        
        return usersResult;
    }

    public Flux<Photos> getPhotos(){
        //return ">> result = " + result.block();
        
        return photoResult;
    }

                                   
}
