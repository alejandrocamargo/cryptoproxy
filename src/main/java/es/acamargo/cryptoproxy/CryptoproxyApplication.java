package es.acamargo.cryptoproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "es.acamargo.cryptoproxy.*")
public class CryptoproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoproxyApplication.class, args);
	}

}

