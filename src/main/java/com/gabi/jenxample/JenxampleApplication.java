package com.gabi.jenxample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenxampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenxampleApplication.class, args);
	}

	public int add(int a, int b){
		return a*b;
	}

}
