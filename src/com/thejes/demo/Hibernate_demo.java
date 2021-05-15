

package com.thejes.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.thejes.Entitiy.customer;

public class Hibernate_demo {
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
			                     .configure("hibernate.cfg.xml")
			                     .addAnnotatedClass(customer.class)
			                     .buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		
		try {
			
			session.beginTransaction();
			
	session.createQuery("update customer set email='love2@gmil.com'").executeUpdate();
			List<customer> thecustomer=session.createQuery("from customer").getResultList();
			
			for(customer cust:thecustomer) {
				System.out.println(thecustomer);
			}
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
	}

	
}
