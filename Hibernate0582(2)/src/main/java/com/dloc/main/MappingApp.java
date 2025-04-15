package com.dloc.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.Answer;
import com.dloc.entities.Question;

public class MappingApp {
public static void main(String[] args) {
	 Configuration cfg=new Configuration();
     cfg.configure("com/dloc/config/hibernate.cfg.xml");
     
     //create and manage session obj, heavy weight and thread safe
     SessionFactory sessionfactory = cfg.buildSessionFactory();
     Session session = sessionfactory.openSession();
     Transaction transaction = session.beginTransaction();
     
     Question q1 = new Question();
     q1.setQid(1);
     q1.setQues("what is life?");
     
     Answer a1= new Answer();
     a1.setAid(2);
     a1.setAns("its all about exploration.");
     q1.setAnswer(a1);
     
     Question q2 = new Question();
     q2.setQid(2);
     q2.setQues("why is life?");
     
     Answer a2= new Answer();
     a2.setAid(3);
     a2.setAns("i dunno");
     q2.setAnswer(a2);
     
     Question q3 = new Question();
     q3.setQid(4);
     q3.setQues("how is life?");
     
     Answer a3= new Answer();
     a3.setAid(5);
     a3.setAns("good");
     q3.setAnswer(a3);
     
     session.save(a1);
     session.save(a1);
     session.save(a1);
     session.save(a1);
     session.save(a1);
     session.save(a1);
     
}
}
