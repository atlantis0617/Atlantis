package com.yhy.atlantis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.yhy.atlantis")
public class AtlantisApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtlantisApplication.class, args);
	}
}
