package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entity.EmployeeEntity;

@SpringBootApplication
public class MavenDemoProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MavenDemoProjectApplication.class, args);
		
		SessionFactory factory = new Configuration(). configure().buildSessionFactory();
		
		Session session  = factory.openSession();
		Transaction t  = session.beginTransaction();
		
		
		
		String findUserString = "FROM employee";
		
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		
		employeeEntity.setFirstName("Avani");
		employeeEntity.setCity("Blaine");
		employeeEntity.setEmail("Avani09@gmail.com");
		employeeEntity.setSalary(20);
	
		
//		int emp_id =1;
//		EmployeeEntity e = session.load(EmployeeEntity.class, emp_id);
//	
//		System.out.println("user first name: "+e.getFirstName());
//		session.save(e);
		System.out.println("Successfully created table");
		t.commit();
		
		factory.close();
		session.close();
		
		
		
		
	}

}
