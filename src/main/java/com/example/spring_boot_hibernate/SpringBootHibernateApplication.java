package com.example.spring_boot_hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootHibernateApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootHibernateApplication.class, args);

		System.out.println("Sunny bhau patil");

		System.out.println("Akshay bhau patil");
	}
}
