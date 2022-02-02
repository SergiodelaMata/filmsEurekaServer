package com.practices.sergiodelamata.filmsEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FilmsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmsEurekaServerApplication.class, args);
	}

}
