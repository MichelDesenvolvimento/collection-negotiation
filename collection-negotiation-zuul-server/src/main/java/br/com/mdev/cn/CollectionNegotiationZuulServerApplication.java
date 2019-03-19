package br.com.mdev.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class CollectionNegotiationZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollectionNegotiationZuulServerApplication.class, args);
    }

}
