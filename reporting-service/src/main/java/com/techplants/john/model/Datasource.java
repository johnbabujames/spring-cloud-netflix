package com.techplants.john.model;

public class Datasource {
	private String datasourceName;
	private String datasourceDriver;
	private String datasourceUrl;
	public Datasource(String datasourceName, String datasourceDriver, String datasourceUrl) {
		super();
		this.datasourceName = datasourceName;
		this.datasourceDriver = datasourceDriver;
		this.datasourceUrl = datasourceUrl;
	}
	public String getDatasourceName() {
		return datasourceName;
	}
	public void setDatasourceName(String datasourceName) {
		this.datasourceName = datasourceName;
	}
	public String getDatasourceDriver() {
		return datasourceDriver;
	}
	public void setDatasourceDriver(String datasourceDriver) {
		this.datasourceDriver = datasourceDriver;
	}
	public String getDatasourceUrl() {
		return datasourceUrl;
	}
	public void setDatasourceUrl(String datasourceUrl) {
		this.datasourceUrl = datasourceUrl;
	}
	
	
}
