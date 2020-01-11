package com.srivastava.apps;

public class C implements IB {
	//private IE e2;
	private IE x;
	public C() {
		System.out.println("C Cons Call");
		
		
	}
	@Override
	public void show() {
		System.out.println("C Show");
		System.out.println(x.getId());
	}
	public IE getX() {
		return x;
	}
	public void setX(IE x) {
		this.x = x;
	}
	
}
