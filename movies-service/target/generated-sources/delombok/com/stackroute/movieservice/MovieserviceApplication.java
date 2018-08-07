package com.stackroute.movieservice;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableDiscoveryClient
@SpringBootApplication
//@EnableMongoRepositories("com.stackroute.movieservice.repository") // this fix the problem
public class MovieserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieserviceApplication.class, args);

	}
}
