package br.com.mdev.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BillingCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingCustomerServiceApplication.class, args);
	}

}
