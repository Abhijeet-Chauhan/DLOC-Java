package com.dloc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")
public class address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addId;
	
	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Column(length = 100, name="street")
	private String street;
	
	private String city;
	
	@Transient
	private double a;
	
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob
	private byte[] image;

	public address(int addId, String street, String city, double a, Date addedDate, byte[] image) {
		super();
		this.addId = addId;
		this.street = street;
		this.city = city;
		this.a = a;
		this.addedDate = addedDate;
		this.image = image;
	}

	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
