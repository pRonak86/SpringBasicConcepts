package com.bean;

import java.util.Iterator;
import java.util.List;

public class ListExample 
{
	private int id;
	private String name;
	private List<String> data;
	public ListExample(int id, String name, List<String> data) {
		super();
		this.id = id;
		this.name = name;
		this.data = data;
	}
	public ListExample() {
		super();
	}
	
	public void display()
	{
		System.out.println(id + " "+name);
		System.out.println("Data is ");
		Iterator<String> itr=data.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
