package com.dloc.entities;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CriteriaDemo {
public static void main(String[] args) {
	Session s= new Configuration().configure("com/dloc/config/hibernate.cfg.xml").buildSessionFactory().openSession();
	
	Criteria c=s.createCriteria(student.class);
	
	List<student> students=c.list();
	for(student st:students) {
		System.out.println(st);
	}
	
//	System.out.println("------------");
//	c.add(Restrictions.eq("city","Houston"));
//	List<student> students1=c.list();
//	for(student st:students1) {
//		System.out.println(st);
//	}
	
	System.out.println("------------");
	c.add(Restrictions.eq("sid",10));
	List<student> students2=c.list();
	for(student st:students2) {
		System.out.println(st);
	}
	
	System.out.println("------------");
	c.add(Restrictions.like("name","Y%"));
	List<student> students21=c.list();
	for(student st:students21) {
		System.out.println(st);
	}
	
	
}
}
