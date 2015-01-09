package com.dkEnt.sample.Controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dkEnt.sample.model.SampleModel;
import com.dkEnt.sample.service.SampleService;
import com.wordnik.swagger.annotations.Api;

@Api(value = "sample", description = "Mybatis REST API Swagger!!") // Swagger annotation
@RestController
public class SampleController {

	
	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private SampleService sampleService;
	
	
	@RequestMapping("/sample/login")
	public List<SampleModel> greeting(@RequestParam(value="name", required=false, defaultValue="World") String name){
			
		List<SampleModel> sampleList = new ArrayList<SampleModel>();
		sampleList = sampleService.getAllLogins();
		
		logger.info("sample 메서드 호출!!");
		
		return sampleList;
	
	}
}
