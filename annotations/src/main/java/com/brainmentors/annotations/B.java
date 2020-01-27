package com.brainmentors.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class B { 
	@Autowired
	private A  a;
	
public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

B(){
	System.out.println("B Cons call");
}
}
