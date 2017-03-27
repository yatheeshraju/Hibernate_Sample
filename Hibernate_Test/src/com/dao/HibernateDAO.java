package com.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDAO {
	private static SessionFactory sf=null;
	public static SessionFactory getSessionFactory() {
		
		
		if (sf==null) {

			Configuration cfg=new Configuration();
			cfg.configure("/resources/hibernate.cfg.xml");
			sf= cfg.buildSessionFactory();
		}
		
		return sf;
	}

}
