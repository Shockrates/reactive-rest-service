package com.example.reactiverestservice;

import com.example.reactiverestservice.Models.User;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/rest")
public class GreetingController {
    
    private GreetingWebClient gwc = new GreetingWebClient();

    @GetMapping("/users")
	public Flux<User> user() {
		return  gwc.getUsers();
    }

    @GetMapping("/hello")
	public String hello() {
		return  "Hello, Spring!";
    }
}
