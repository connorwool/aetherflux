package com.connorwool.aetherflux;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class AetherfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(AetherfluxApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		return args -> {
			System.out.println("Lets inspect the beans provided by SpringBoot:");
			String[] beanNames = context.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String name : beanNames){
				System.out.println(name);
			}
		};
	}
}
