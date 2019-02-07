package com.example.securitytest;

import com.example.utils.security.resource.annotations.EnableExampleResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableExampleResourceServer
@SpringBootApplication
public class SecurityTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityTestApplication.class, args);
	}

}

