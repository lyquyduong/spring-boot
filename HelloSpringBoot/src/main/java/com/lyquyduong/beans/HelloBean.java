package com.lyquyduong.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class HelloBean {

	public void sayHello(){
		System.out.println("Hello Spring Boot");
	}
}
