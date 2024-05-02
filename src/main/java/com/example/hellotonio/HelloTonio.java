package com.example.hellotonio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloTonio {

    @GetMapping("/")
    public String home() {
        return "Hello Tonio!";
    }
	public static void main(final String[] args) {
		SpringApplication.run(HelloTonio.class, args);
	}

}
