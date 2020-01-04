package com.srivastava.apps;

public class C implements IB {
	public C() {
		System.out.println("C Cons Call");
	}
	@Override
	public void show() {
		System.out.println("C Show");
	}
}
