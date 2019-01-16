package com.techplants.john.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techplants.john.model.Datasource;

@RestController
public class DatasourceController {

	private List<Datasource> datasourceList;
	
	@GetMapping("/rpt-datasource")
	public List<Datasource> getDatasource(){
		datasourceList = new ArrayList<>();
		datasourceList.add(new Datasource("ORACLE", "oracle driver", "oracle db url"));
		datasourceList.add(new Datasource("SYBSSE", "sybase driver", "sybase db url"));
		datasourceList.add(new Datasource("DB2", "db2 driver", "db2 db url"));
		
		return datasourceList;
	}
}
