package com.cmc.iis.learn.dal.factory;

import org.hibernate.SessionFactory;

public class HibernateSessionFactory {

	private static SessionFactory sessionFactory;

	  public static SessionFactory getSessionFactory()
	  {
	    return sessionFactory;
	  }
	  public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
	  }
}
