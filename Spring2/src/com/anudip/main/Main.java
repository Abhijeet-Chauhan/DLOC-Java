package com.anudip.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anudip.beans.Student;
import com.anudip.resources.SpringConfigFile;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
	
	Student std=(Student)context.getBean("stdId1");
	System.out.println(std);
	
	Student std1=(Student)context.getBean("stdObj");
	System.out.println(std1);
	
}
}

