package com.dloc.main;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.Answer;
import com.dloc.entities.Question;
import com.dloc.entities.Answer;

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
        
        Question q1 = new Question();
        q1.setQid(111);
        q1.setQues("what is java");
        
        
        Question q2 = new Question();
        q2.setQid(122);
        q2.setQues("what is python");
        
        
        Answer a1 = new Answer();
        a1.setAid(222);
        a1.setAns("language");
        a1.setQuestion(q1);
        
        Answer a2 = new Answer();
        a2.setAid(333);
        a2.setAns("prog language");
        a2.setQuestion(q1);
  
        Answer a3 = new Answer();
        a3.setAid(444);
        a3.setAns("dk");
        a3.setQuestion(q1);
		
        List<Answer> list =new ArrayList<Answer>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        
        session.save(q1);
        session.save(a1);
        session.save(a2);
        session.save(a3);
		transaction.commit();
		System.out.println("inserted");
		
		Question q = session.get(Question.class, 111);
		for(Answer a:q.getAnswers()) {
			System.out.println(a.getAns());
		}
		
    }
    }