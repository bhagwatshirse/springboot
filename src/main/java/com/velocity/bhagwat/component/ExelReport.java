package com.velocity.bhagwat.component;

import org.springframework.stereotype.Component;

@Component("exel")
public class ExelReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("exel report generated");
		
	}
	

}
