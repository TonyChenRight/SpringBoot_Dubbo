package com.huobi.springbootdubboclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo/dubbo-consumer.xml"})
public class SpringbootDubboClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboClientApplication.class, args);
	}
}
