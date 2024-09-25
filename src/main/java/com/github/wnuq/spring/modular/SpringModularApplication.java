package com.github.wnuq.spring.modular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.github.wnuq")
@EnableJpaRepositories(basePackages = "com.github.wnuq")
@EntityScan(basePackages = "com.github.wnuq")
@SpringBootApplication
public class SpringModularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringModularApplication.class, args);
	}

}
