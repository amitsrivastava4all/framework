package com.srivastava.apps;

import java.util.Map;
import java.util.Set;

public class Student {
	//List<Course> courses;
	//Set<Course> courses;
	Map<String, Course> courses;
	public Map<String,Course> getCourses() {
		return courses;
	}

	public void setCourses(Map<String,Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		courses.get("first").getCorD(false);
		return "Courses [courses=" + courses + "]";
	}
	

}
