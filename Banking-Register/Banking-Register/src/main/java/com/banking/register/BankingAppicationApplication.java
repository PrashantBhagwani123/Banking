package com.banking.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BankingAppicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppicationApplication.class, args);
		
	}

}
