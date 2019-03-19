package br.com.mdev.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CollectionNegotiationAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionNegotiationAuthServerApplication.class, args);
	}

}
