package com.brainmentors.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("x")
public class X {
	
	public X() {
		System.out.println("X Cons call");
	}
	@Autowired
	private E e1;

	public E getE1() {
		return e1;
	}

	public void setE1(E e1) {
		this.e1 = e1;
	}
	
	
	

}
