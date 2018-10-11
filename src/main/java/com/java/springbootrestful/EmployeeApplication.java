package com.java.springbootrestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeApplication {       

	public static void main(String as[])
	{
		
		SpringApplication.run(EmployeeApplication.class, as);
	}
	
	
}
