package com.projects.ceilingfan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CeilingFanApplication {

	public static void main(String[] args) {
		SpringApplication.run(CeilingFanApplication.class, args);
	}

}
