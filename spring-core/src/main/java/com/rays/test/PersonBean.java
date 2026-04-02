package com.rays.test;

public class PersonBean {
	
	private String name;
	private String address;
	
	public PersonBean() {
		
	}
	public PersonBean(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
