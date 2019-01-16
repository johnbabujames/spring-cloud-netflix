package com.techplants.john;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.techplants.john.model.Datasource;
@FeignClient("datasource-service")
@RibbonClient("datasource-service")
public interface DatasourceServiceProxy {

	@GetMapping("/rpt-datasource")
	public List<Datasource> getDatasource();
}
