package com.brainmentors.apps.jdbcexample;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ConfigDemo.class);
       //ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
       DAO dao = (DAO)ac.getBean("dao");
       System.out.println(dao.getJdbcTemplate());
       Employee emp = (Employee)ac.getBean("emp");
       emp.setId(1003);
       emp.setName("shyam");
       emp.setSalary(1999);
       String result = dao.add(emp)>0?"Record Added":"Not Added";
       System.out.println(result);
       List<Employee> empList = dao.getRecords(1000);
       for(Employee e : empList) {
    	   System.out.println(e);
       }
       System.out.println(dao.tableCreate()?"Created":"Not Created");
       System.out.println("Named Example");
       System.out.println(dao.getNamedParamRecords("shyam", 1000));
    }
}
