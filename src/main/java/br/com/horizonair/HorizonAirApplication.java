package br.com.horizonair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HorizonAirApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorizonAirApplication.class, args);
	}

}
