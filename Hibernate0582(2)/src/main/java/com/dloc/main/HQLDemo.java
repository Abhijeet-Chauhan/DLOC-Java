package com.dloc.main;
import org.hibernate.Query;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.student;

public class HQLDemo {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
    cfg.configure("com/dloc/config/hibernate.cfg.xml");

    SessionFactory sessionFactory = cfg.buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    
//    student s1=new student();
//    s1.setSid(1);
//    s1.setName("abhi");
//    s1.setCity("bombay");
//    
//    student s2=new student();
//    s2.setSid(2);
//    s2.setName("abhijeet");
//    s2.setCity("mumbai");
//    
//    student s3=new student();
//    s3.setSid(3);
//    s3.setName("abc");
//    s3.setCity("xyz");
//    
//    session.save(s1);
//    session.save(s2);
//    session.save(s3);
//    
//    transaction.commit();
    
    String query="from student";
    Query q=session.createQuery(query);
    
    List<student> list = q.list();
    for (student st:list){
    	System.out.println(st.getName());
    }
    
    System.out.println("-------------------");
    String query1="from student where city=:x";
    Query q3=session.createQuery(query1);
    q3.setParameter("x", "mumbai");
    
    List<student> list2=q3.list();
    for(student st:list2) {
    	System.out.println(st.getName());
    }
    
    
}
}
