package com.brainmentors.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Caller {
	@Autowired
	@Qualifier("fasterprod")
	private IProducer producer;

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
