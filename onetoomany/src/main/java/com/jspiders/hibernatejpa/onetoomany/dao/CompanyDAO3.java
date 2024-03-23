package com.jspiders.hibernatejpa.onetoomany.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernatejpa.onetoomany.dto.CompanyDTO;
import com.jspiders.hibernatejpa.onetoomany.dto.EmployeeDTO;

public class CompanyDAO3 {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {

		CompanyDTO company = new CompanyDTO();
		company.setName("Tata");
		company.setLocation("Pune");

		EmployeeDTO employee1 = new EmployeeDTO();
		employee1.setName("ajay");
		employee1.setEmail("ajay@gmail.com");
		employee1.setMobile(9850664508l);

		EmployeeDTO employee2 = new EmployeeDTO();
		employee2.setName("vijay");
		employee2.setEmail("vijay@gmail.com");
		employee2.setMobile(9876543211l);

		EmployeeDTO employee3 = new EmployeeDTO();
		employee3.setName("sanjay");
		employee3.setEmail("sanjay@gmail.com");
		employee3.setMobile(9876452243l);

		EmployeeDTO employee4 = new EmployeeDTO();
		employee4.setName("digvijay");
		employee4.setEmail("digvijays@gmail.com");
		employee4.setMobile(988674613l);

		List<EmployeeDTO> employees = new ArrayList<EmployeeDTO>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		company.setEmployees(employees);

		openConnection();
		entityTransaction.begin();

		entityManager.persist(company);

		entityTransaction.commit();
		closeConnection();

	}

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("company");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	private static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}

}