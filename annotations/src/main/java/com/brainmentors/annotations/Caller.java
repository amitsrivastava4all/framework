package com.brainmentors.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Caller {
	@Autowired
	//@Qualifier("fasterprod")
	private IProducer producer;
	// DI in Constructor Level
	private T t;
	@Autowired
	Caller(@Qualifier("t") T t){
		this.t = t;
		System.out.println("Caller Cons Call T is "+t);
		//t.show();
		
	}
//	Caller(){
//		System.out.println("Caller Cons Call");
//	}
	
	void callT() {
		System.out.println("T is "+t);
		System.out.println("Inside Call T ");
		t.show();
	}
	void print() {
		System.out.println("Inside Print");
		producer.show();
	}
	public IProducer getProducer() {
		return producer;
	}

	public void setProducer(IProducer producer) {
		this.producer = producer;
	}
	

}
