package com.velocity.bhagwat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.velocity.bhagwat.service.ReportService;

@SpringBootApplication
public class Spring2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring2Application.class, args);
		  ReportService service = context.getBean(ReportService.class);
		  service.downloadReport();
	}
 
}
