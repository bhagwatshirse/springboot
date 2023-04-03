package com.velocity.bhagwat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.velocity.bhagwat.component.IReport;

@Service
public class ReportService {
	
	//@Autowired
	//field type injection
   //	@Qualifier("exel")
	private final IReport report;
	
	// constructor based injection
	@Autowired
	public ReportService(@Qualifier("exel") IReport report) {
		this.report=report;
	}
	 
	public void downloadReport() {
		report.generateReport();
	}

}
