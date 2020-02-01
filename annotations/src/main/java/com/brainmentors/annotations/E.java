package com.brainmentors.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("e1")
//@Scope("prototype")
public class E {
private int x , y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	E(){
		
	}
	E(int x){
		
	}
	E(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("2 param");
	}
	public void show() {
		System.out.println("E Show Call "+x+" "+y);
	}
}
