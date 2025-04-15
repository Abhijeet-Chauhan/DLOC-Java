package com.anudip.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anudip.beans.Student;
public class Main {
public static void main(String[] args) {
	String config_file="/com/anudip/resources/applicationContext.xml";
	ApplicationContext context= new ClassPathXmlApplicationContext(config_file);
	
//	Student std=(Student)context.getBean(Student.class);
	Student std=(Student)context.getBean("std");
	System.out.println(std);

}
}

