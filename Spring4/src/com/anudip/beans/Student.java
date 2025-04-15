package com.anudip.beans;

import org.springframework.beans.factory.annotation.Autowired;

//POJO plain old java object

public class Student {
	
	private int rollno;
	private String name;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Subject subject;
	
public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", subject=" + subject + "]";
	}





	



}
