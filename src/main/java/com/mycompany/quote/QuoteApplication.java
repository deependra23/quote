package com.mycompany.quote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication

public class QuoteApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(QuoteApplication.class, args);
	}

}
