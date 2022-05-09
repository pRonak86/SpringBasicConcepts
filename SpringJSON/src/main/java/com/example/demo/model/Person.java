package com.example.demo.model;

public class Person {
	
	private String fname;
	private String lname;
	private String city;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Firstname :" +getFname()+ "\nLastName :"+getLname()+"\nCity:"+getCity();
	}
	

}
