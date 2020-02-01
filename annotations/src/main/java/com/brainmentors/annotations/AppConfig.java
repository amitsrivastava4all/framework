package com.brainmentors.annotations;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.brainmentors")
public class AppConfig {
	
	@Bean(name = "e1")
	E getE() {
		E obj =  new E(10,20);
		obj.setX(obj.getX() + obj.getY());
		obj.setY(obj.getX() * obj.getY());
		return obj;
	}
	
	@Bean(name="s")
	Scanner getScanner() {
		return new Scanner(System.in);
	}
	

}
