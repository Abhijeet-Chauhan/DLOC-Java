package com.anudip.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//POJO plain old java object

@Component
public class Student {
	
	@Value("alex")
private String name;
	@Value("123")
private int rollno;
	@Value("alex@mail.com")
private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + ", email=" + email + "]";
}

}
