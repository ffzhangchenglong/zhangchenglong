package com.util;

import org.apache.log4j.Logger;


public class CacheService {
	private static String SERVICE_NAME = "cacheService";
	
	private static Logger logger = Logger.getLogger(CacheService.class.getName());
	
	private String cacheHost;
	private String cachePass;
	private int cachePort;
	
	public String getCacheHost() {
		return cacheHost;
	}
	public void setCacheHost(String cacheHost) {
		this.cacheHost = cacheHost;
	}
	public String getCachePass() {
		return cachePass;
	}
	public void setCachePass(String cachePass) {
		this.cachePass = cachePass;
	}
	public int getCachePort() {
		return cachePort;
	}
	public void setCachePort(int cachePort) {
		this.cachePort = cachePort;
	}
	
	public void init(){
		logger.info("cacheHost:"+cacheHost);
		logger.info("cachePass:"+cachePass);
		logger.info("cachePort:"+cachePort);
		System.out.println("cacheHost:"+cacheHost);
		System.out.println("cachePass:"+cachePass);
		System.out.println("cachePort:"+cachePort);
	}

}
