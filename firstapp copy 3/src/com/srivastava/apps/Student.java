package com.srivastava.apps;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
	//List<Course> courses;
	//Set<Course> courses;
	Map<String, Course> courses;
	public Map<String,Course> getCourses() {
		return courses;
	}
	public Student() {
		System.out.println("Student Cons Call");
	}
	public void start() {
		System.out.println("Start");
	}
	public void end() {
		System.out.println("End");
	}
	public void setCourses(Map<String,Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		courses.get("first").getCorD(false);
		return "Courses [courses=" + courses + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Like Start");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Like End");
	}
	

}
