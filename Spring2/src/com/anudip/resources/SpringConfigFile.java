package com.anudip.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anudip.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Student stdId1() {
		Student st1=new Student();
		st1.setName("Abhijeet");
		st1.setRollno(17);
		st1.setEmail("abhijeet@mail.com");
		
		return st1;
	}
	
	@Bean(name="stdObj")
	public Student stdId2() {
		Student st1=new Student();
		st1.setName("Abhi");
		st1.setRollno(107);
		st1.setEmail("abhi@mail.com");
		
		return st1;
	}
}
