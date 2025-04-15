package com.dloc.main;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.address;
import com.dloc.entities.student;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
        Configuration cfg=new Configuration();
        cfg.configure("com/dloc/config/hibernate.cfg.xml");
        
        //create and manage session obj, heavy weight and thread safe
        SessionFactory sessionfactory = cfg.buildSessionFactory();
        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();
        
  
		student st1=new student();
		st1.setSid(121);
		st1.setName("abhi");
		st1.setCity("mumbai");
		
		address ad1 = new address();
		ad1.setStreet("a2 street");
		ad1.setCity("munbai");
		ad1.setAddedDate(new Date());
		ad1.setA(102.32);
		
		
		FileInputStream file= new FileInputStream("src/main/java/com/dloc/main/a.png");
		byte[] data= new byte[file.available()];
		file.read(data);
		ad1.setImage(data);
		
		session.save(st1);
		session.save(ad1);
		
		transaction.commit();
		System.out.println("inserted");
		
    }
    }