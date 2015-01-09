package com.dkEnt.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dkEnt.sample.model.SampleModel;
import com.dkEnt.sample.mybatis.mapper.SampleMapper;


@Service("loginService")
public class SampleService {
	
	
	@Autowired
//	private LoginDao loginDao;
	private SampleMapper sampleMapper;

	
	private Logger logger = Logger.getLogger(getClass());
	
	
	public List<SampleModel> getAllLogins() {				
		
		List<SampleModel> sampleList = new ArrayList<SampleModel>();
		
		try {
			
			logger.info("Service init()");
			sampleList = sampleMapper.sampleSelect();
			logger.info("Service Success");
			
		} catch (Exception e) {
			
			logger.error("service error");
			System.out.println(e);
		}
		return sampleList;
		//return loginDao.getAllLogins();
	}
}
