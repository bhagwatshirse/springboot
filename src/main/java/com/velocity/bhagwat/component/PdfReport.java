package com.velocity.bhagwat.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

    @Component("pdf")
//@Primary
   public class PdfReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("this is pdf report");
		
	}
	

}
