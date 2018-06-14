package com.huobi.springbootdubboserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo/dubbo-provider.xml"})
public class SpringbootDubboServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboServerApplication.class, args);
	}
}