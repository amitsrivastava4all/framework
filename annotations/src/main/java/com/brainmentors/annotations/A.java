package com.brainmentors.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class A {
	@Autowired
	private B b;
	
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	A(){
		System.out.println("A Cons Call");
	}

}
