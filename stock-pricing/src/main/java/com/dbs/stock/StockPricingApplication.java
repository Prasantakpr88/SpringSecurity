package com.dbs.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
public class StockPricingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPricingApplication.class, args);
	}

	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {

		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

}
