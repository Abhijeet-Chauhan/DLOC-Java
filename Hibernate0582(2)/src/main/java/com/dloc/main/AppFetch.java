package com.dloc.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.student;

public class AppFetch {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
    cfg.configure("com/dloc/config/hibernate.cfg.xml");
    
    //create and manage session obj, heavy weight and thread safe
    SessionFactory sessionfactory = cfg.buildSessionFactory();
    Session session = sessionfactory.openSession();
    Transaction transaction = session.beginTransaction();
    
    student student =session.load(student.class, 101);
    System.out.println(student);
}
}
