package com.banking.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingAccountApplication {

	public static void main(String[] args) {
		System.out.println("jenkins is running");
		SpringApplication.run(BankingAccountApplication.class, args);
	}

}
