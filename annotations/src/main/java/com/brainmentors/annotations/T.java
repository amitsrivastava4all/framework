package com.brainmentors.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t")
@Scope("prototype")
public class T {
	T(){
		System.out.println("T Cons Call");
	}
	public void show() {
		System.out.println("T show");
	}
}
