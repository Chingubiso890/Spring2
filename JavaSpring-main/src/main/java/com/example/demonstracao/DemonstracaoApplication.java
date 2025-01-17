package com.example.demonstracao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemonstracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemonstracaoApplication.class, args);
	}

	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "João") String name) {
      return String.format("<h1>Hello %s!", name, "</h1>");
    }
}