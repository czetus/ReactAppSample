package com.danes.raactspringapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@ComponentScan(value = "com.danes.raactspringapp.domain") */
public class RaactSpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(RaactSpringAppApplication.class, args);

		Impl impl = new Impl();
		impl.getMeString(null);

	}
}
