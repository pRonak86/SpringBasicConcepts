package com.bean;

public class StudentDetails {
	private Student s; // abstraction -- byName--Single time ,byType--Multiple time of use student 
	public StudentDetails() {
		System.out.println("Student Details Class Constructor");
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	
	public void test()
	{
		System.out.println("test called from Student details");
	}
	public void demo()
	{
		test();
		s.display();
	}
}
