package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Employee;

public class Test {

	public static void main(String[] args) {

	/*	Configuration cfg=new Configuration();
		cfg.configure("/resources/hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx=session.beginTransaction();
		 
		Employee e= new Employee();
		//e.setEmpname("Yath");
		//e.setEmpid("2");
		//e.setEmpage("26");
		//session.save(e);
		
		session.load(e, "2");
		System.out.println(e.getEmpname()+":"+e.getEmpage());
		tx.commit();
		session.close();
		sf.close();*/
		
		
	}

}
