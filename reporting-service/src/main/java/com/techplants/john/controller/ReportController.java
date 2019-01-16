package com.techplants.john.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techplants.john.DatasourceServiceProxy;
import com.techplants.john.model.Datasource;
import com.techplants.john.model.Report;

@RestController
public class ReportController {
	
	private List<Report> reportList;
	private List<Datasource> reportDatasource;
	
	@Autowired
	private DatasourceServiceProxy dsServiceProxy;

	@GetMapping("/reports")
	public List<Report> getReports(){
		reportList = new ArrayList<>();
		reportList.add(new Report("Report 1", "PDF"));
		reportList.add(new Report("Report 2", "Excel"));
		reportList.add(new Report("Report 3", "CSV"));
		
		return reportList;
	}
	
	@GetMapping("/report-ds")
	public List<Datasource> getDatasource(){
		System.out.println("============================== john ======================================");
		reportDatasource = new ArrayList<>(); 
		reportDatasource = dsServiceProxy.getDatasource();
		return reportDatasource;
	}
}
