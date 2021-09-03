package com.nimo.test;

import com.nimo.config.HelloConfig;
import com.nimo.dao.HelloSpring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(HelloConfig.class);
		HelloSpring bean = annotationConfigApplicationContext.getBean(HelloSpring.class);
		bean.hello();
	}
}
