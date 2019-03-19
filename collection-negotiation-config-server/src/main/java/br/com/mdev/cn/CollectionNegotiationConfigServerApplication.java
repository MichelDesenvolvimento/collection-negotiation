package br.com.mdev.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CollectionNegotiationConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionNegotiationConfigServerApplication.class, args);
	}

}
