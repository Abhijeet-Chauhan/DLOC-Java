package com.dloc.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.dloc.entities.user;
public class appdelete {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
    cfg.configure("com/dloc/config/hibernate.cfg.xml");
    
    SessionFactory sessionfactory = cfg.buildSessionFactory();
    Session session = sessionfactory.openSession();
    Transaction transaction = session.beginTransaction();
    
   try {
	   user udelete = new user();
	   udelete.setId(2);
	   session.delete(udelete);
	   transaction.commit();
	   System.out.println("user delete");
   }catch(Exception e) {
	   transaction.rollback();
	   e.printStackTrace();
	   System.out.println("failed");
   }
    
}
}
