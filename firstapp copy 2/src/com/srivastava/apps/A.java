package com.srivastava.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class A {

	public static void main(String[] args) {
		//System.out.println("Before AC ");
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		//ApplicationContext ac = new FileSystemXmlApplicationContext("spring.xml");
		//System.out.println("After AC");
		
//		IB obj = (IB)ac.getBean("myobject");
//		//IB obj2 = (IB)ac.getBean("myobject2");
//		//D.call(ac);
//		obj.show();
		//obj.print();
		Student ram = (Student) ac.getBean("student");
		System.err.println(ram);
		
	}

}
