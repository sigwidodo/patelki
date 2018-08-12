package com.patelki.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.patelki")
@MapperScan(basePackages="com.patelki")
public class MapperApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(MapperApplication.class, args);
		
	}

}
