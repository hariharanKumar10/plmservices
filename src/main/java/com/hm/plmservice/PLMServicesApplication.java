package com.hm.plmservice;

import com.hm.castor.repos.ColorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses= ColorRepository.class)
public class PLMServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PLMServicesApplication.class, args);
	}

}
