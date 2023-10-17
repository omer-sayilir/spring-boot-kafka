package com.madadipouya.springkafkatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class SpringKafkaTestApplication {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		SpringApplication.run(SpringKafkaTestApplication.class, args);
	}
}
