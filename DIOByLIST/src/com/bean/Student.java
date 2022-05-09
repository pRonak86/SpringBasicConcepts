package com.bean;

import java.util.Iterator;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String> data;
	public Student(int id, String name, List<String> data) {
		super();
		this.id = id;
		this.name = name;
		this.data = data;
	}
	
	public void display()
	{
		System.out.println("ID is -->"+id);
		System.out.println("Name is -->"+name);
		//cursor-->Enumeration,Iterator,ListIterator
		Iterator<String> itr=data.iterator();
		while(itr.hasNext())
		{
			System.out.println("Value is--"+itr.next());
		}
	}

}
