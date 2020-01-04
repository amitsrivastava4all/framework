package com.srivastava.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A {

	public static void main(String[] args) {
		System.out.println("Before AC ");
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("After AC");
		IB obj = (IB)ac.getBean("myobject");
		obj.show();
		//obj.print();
	}

}
