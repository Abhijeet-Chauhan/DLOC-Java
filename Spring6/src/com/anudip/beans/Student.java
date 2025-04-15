package com.anudip.beans;

import org.springframework.beans.factory.annotation.Autowired;

//POJO plain old java object

public class Student {
	
	private int rollno;
	private String name;
	
	private Address address;

	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}




}
