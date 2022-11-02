package com.ssd.easynote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class EasynoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasynoteApplication.class, args);
	}

}
