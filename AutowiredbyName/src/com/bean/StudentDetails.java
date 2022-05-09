package com.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentDetails {
	private Student s;
	public StudentDetails()
	{
		System.out.println("Default Constructor of Student Detials");
	}
	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}
	public void test()
	{
		System.out.println("Test Method called from Student details");
	}
	public void display()
	{
		test();
		s.paint();
	}

}
