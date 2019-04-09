package com.healthcare.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class HibernateAppConfiguration {
	
	@Bean
	public SessionFactory setSessionFactory() {
		Configuration config = new Configuration();
        SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
        return sessionFactory;
	}
}
