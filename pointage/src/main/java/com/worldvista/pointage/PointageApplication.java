package com.worldvista.pointage;

//import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class PointageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PointageApplication.class, args);
	}

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
