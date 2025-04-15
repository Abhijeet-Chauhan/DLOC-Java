package com.anudip.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anudip.beans.Address;
import com.anudip.beans.Student;
import com.anudip.beans.Subject;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddr() {
		Address addr=new Address();
		addr.setCity("mumbai");
		addr.setPincode(1234);
		return addr;
	}
	
//	@Bean
//	public Address createAddr2() {
//		Address addr=new Address();
//		addr.setCity("Palghar");
//		addr.setPincode(5678);
//		return addr;
//	}
	
	@Bean
	public Subject createSub() {
		Subject subj = new Subject();
		List<String> subject_list= new ArrayList<String>();
		subject_list.add("java");
		subject_list.add("python");
		subject_list.add("c");
		subject_list.add("c++");
		subj.setSubjects(subject_list);
		return subj;
	}
	
	@Bean
	public Student createStd() {
		Student std = new Student();
		std.setName("abhi");
		std.setRollno(17);
//		std.setAddress(createAddr());
		return std;
	}
	

}
