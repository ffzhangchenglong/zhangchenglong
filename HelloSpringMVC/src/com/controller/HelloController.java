package com.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.util.CacheService;

@Controller
public class HelloController {
	private static Logger logger = Logger.getLogger(HelloController.class.getName());
	@Autowired
	private CacheService cacheService;
	
	@RequestMapping("hello.dao")
	public String hello(){
		logger.info("Hello!!!!!");
		System.out.println("Hello!!!!!");
		cacheService.init();
		return "hello";
	}
}