package com.srivastava.apps;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Course implements ApplicationContextAware,BeanNameAware {
	private int id;
	private String name;
	private int duration;
	
	
	public void getCorD(boolean x) {
		System.out.println("Bean Name is "+beanName);
		if(x) {
		C c = (C)ac.getBean("myobject");
		c.show();
		}
		else {
			E d = (E) ac.getBean("e3");
			d.setName("Ram");
			System.out.println(d.getName());
		}
	}
	
	@Override
	public int hashCode() {
		return duration;
	}
	@Override
	public boolean equals(Object object) {
		if(object instanceof Course) {
			Course course = (Course) object;
			if(course.id== this.id && course.name.equals(this.name) && course.duration== this.duration) {
				return true;
			}
		}
		return false;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
	private ApplicationContext ac;
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.ac = arg0;
		
	}
	private String beanName;
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		this.beanName = arg0;
		
	}
	
}
