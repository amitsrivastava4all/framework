package com.brainmentors.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fasterprod")
@Primary
public class FasterProducer implements IProducer {
	@Override
	public void show() {
		System.out.println("Faster Producer Show");
		// TODO Auto-generated method stub
		
	}
}
