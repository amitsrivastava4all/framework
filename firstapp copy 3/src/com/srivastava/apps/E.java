package com.srivastava.apps;

public class E implements IE{
	private int id;
	private String name;
	public E() {
		System.out.println("E Cons Call");
	}
	public E(int id) {
		this();
		System.out.println("E Param Cons Call "+id);
		this.id = id;
	}
	public E(int id, String name) {
		this();
		System.out.println("E 2 Param Cons Call "+id+" "+name);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
