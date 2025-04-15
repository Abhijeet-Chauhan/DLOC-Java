package com.dloc.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.dloc.entities.address;
import com.dloc.entities.student;
import com.dloc.entities.Certificate;

public class EmbeedDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
    cfg.configure("com/dloc/config/hibernate.cfg.xml");
    
    //create and manage session obj, heavy weight and thread safe
    SessionFactory sessionfactory = cfg.buildSessionFactory();
    Session session = sessionfactory.openSession();
    Transaction transaction = session.beginTransaction();
    
    student st1=new student();
    st1.setSid(105);
    st1.setName("abc");
    st1.setCity("punjab");
    
    Certificate cert1= new Certificate();
    
    
    cert1.setCourse("abcc");
    cert1.setDuration("3 month");
    st1.setCert(cert1);
    
    session.save(st1);
    transaction.commit();
}
}
