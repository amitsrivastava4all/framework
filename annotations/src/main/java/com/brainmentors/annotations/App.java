package com.brainmentors.annotations;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	X obj = (X) ac.getBean("x");
    	obj.getE1().show();
    	Scanner ss = (Scanner) ac.getBean("s");
    	System.out.println("Enter the Name");
    	String name = ss.next();
    	System.out.println("Your Name is "+name);
    	
    	//E e = (E)ac.getBean("e1");
    	//e.show();
    	
        //ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//        Caller caller = (Caller)ac.getBean("caller");
//        //caller.print();
//        caller.callT();
       // A a = (A) ac.getBean("a");
        
    }
}
