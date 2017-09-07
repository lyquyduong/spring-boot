package com.lyquyduong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lyquyduong.beans.HelloBean;


@SpringBootApplication(scanBasePackages = { "com.lyquyduong.beans" })
public class HelloSpringBootApplication implements CommandLineRunner{

	@Autowired
	private HelloBean helloBean;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(HelloSpringBootApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("this is testing");
		helloBean.sayHello();
	}
}
