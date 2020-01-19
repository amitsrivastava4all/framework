package com.brainmentors.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prod")
//@Scope("prototype")
public class Producer implements IProducer {

	@Override
	public void show() {
		System.out.println("Producer Show");
		// TODO Auto-generated method stub
		
	}

}
