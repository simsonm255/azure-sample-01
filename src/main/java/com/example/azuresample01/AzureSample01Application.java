package com.example.azuresample01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSample01Application {

	public static void main(String[] args) {
		SpringApplication.run(AzureSample01Application.class, args);
	}

	@GetMapping("/message")
	public String getMessage(){
		return "hi hello welcome azure cloud";
	}
}
