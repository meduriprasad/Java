package org.anjaneya.ilearnspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BuildObject {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		context.registerShutdownHook();
		Shape shape= (Shape)context.getBean("objectType");
		shape.draw();

	}

}
