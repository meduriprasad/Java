package org.anjaneya.ilearnspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BuildObject {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		//AbstractApplicationContext is used here to register shutdown hook as it is standalone application, in which not required in web application
		context.registerShutdownHook();
		Shape shape= (Shape)context.getBean("objectType");
		shape.draw();

	}

}
