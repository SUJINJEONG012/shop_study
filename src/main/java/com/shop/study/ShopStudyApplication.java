package com.shop.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ShopStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopStudyApplication.class, args);
	}
	
	@GetMapping("/")
	public String HelloWorld() {
		return "hello world!";
	}

}
