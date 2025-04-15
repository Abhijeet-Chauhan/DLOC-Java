package com.dloc.entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	private int sid;
	
	private String name;
	private String city;
	
	private Certificate cert;
	
	public Certificate getCert() {
		return cert;
	}
	public void setCert(Certificate cert) {
		this.cert = cert;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "student [sid=" + sid + ", name=" + name + ", city=" + city + "]";
	}
	
}
