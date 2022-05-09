package com.bean;

public class Student 
{
	private String name;
	private int id;
	public Student(String name, int id) {
	
		this.name = name;
		this.id = id;
	}

	public Student() {
		
	}

	public Student(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("welcome ---"+name+"--your id--"+id);
	}
	
}
