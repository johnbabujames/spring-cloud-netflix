package com.techplants.john.model;

public class Report {
	private String reportName;
	private String reportOuputType;
	public Report(String reportName, String reportOuputType) {
		super();
		this.reportName = reportName;
		this.reportOuputType = reportOuputType;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getReportOuputType() {
		return reportOuputType;
	}
	public void setReportOuputType(String reportOuputType) {
		this.reportOuputType = reportOuputType;
	}
	
	
}
