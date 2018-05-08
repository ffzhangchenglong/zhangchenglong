package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringWebContextUtils implements ApplicationContextAware{

	private static ApplicationContext context = null;

	public static <T> T getBean(String name) {
		return (T) context.getBean(name);
	}
	
	public static <T> T getBean(Class<T> requiredType) {
		return context.getBean(requiredType);
	}

	public static Object getBean(String name, Class requiredType) {
		return context.getBean(name, requiredType);
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		SpringWebContextUtils.context = applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return context;
	}
}
