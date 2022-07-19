package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);

		System.out.println("하히ㅏㅣ");
		System.out.println("하히ㅏㅣ");
		System.out.println("하히ㅏㅣ");
		System.out.println("하히ㅏㅣ");
		System.out.println("하히ㅏㅣ");
		System.out.println("하히ㅏㅣ");
		System.out.println("하히ㅏㅣ22222222222222222222222");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(BackendApplication.class);
	}

}
