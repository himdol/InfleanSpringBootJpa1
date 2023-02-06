package com.jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		hello.setHello("hello");
		String data = hello.getHello();
		System.out.println(data);

		SpringApplication.run(JpashopApplication.class, args);
	}

}
