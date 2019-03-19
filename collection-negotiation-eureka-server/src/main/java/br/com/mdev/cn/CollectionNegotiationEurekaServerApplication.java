package br.com.mdev.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CollectionNegotiationEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionNegotiationEurekaServerApplication.class, args);
	}

}
