package com.bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Map<String, String> data;
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
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	
	public void display()
	{
		System.out.println("Id is -- "+id);
		System.out.println("Name is---"+name);
		Set<Entry<String, String>> set=data.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<String , String> entry=itr.next();
			System.out.println("Key is---"+entry.getKey()+"--name is--"+entry.getValue());
		}
	}

}
