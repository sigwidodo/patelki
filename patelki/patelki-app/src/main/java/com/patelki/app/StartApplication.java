package com.patelki.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages="com.patelki")
@ComponentScan(basePackages="com.patelki")
public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(StartApplication.class, args);

	}

}
