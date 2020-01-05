package com.srivastava.apps;

public class C implements IB {
	private IE e2;
	public C() {
		System.out.println("C Cons Call");
		
		
	}
	@Override
	public void show() {
		System.out.println("C Show");
		System.out.println(e2.getId());
	}
	public IE getE2() {
		return e2;
	}
	public void setE2(IE x) {
		this.e2 = x;
	}
	
}
