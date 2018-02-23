package org.anjaneya.ilearnspringAop;

import org.anjaneya.ilearnspringAop.service.ShapeService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		context.registerShutdownHook();
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		System.out.println("==="+shapeService.getCircle().getName());
		System.out.println("==="+shapeService.getTriangle().getName());
	}

}
