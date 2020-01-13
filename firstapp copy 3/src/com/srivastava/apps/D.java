package com.srivastava.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class D {

	public static void call(ApplicationContext ac) {
		
		IB obj = (IB)ac.getBean("myobject");
		
		obj.show();

	}

}
