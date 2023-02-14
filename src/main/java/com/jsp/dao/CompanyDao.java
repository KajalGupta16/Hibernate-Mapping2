package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Company;
import com.jsp.dto.GST;

public class CompanyDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kajal");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void testSave(GST gst, Company company) {
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

	public void deleteById(Company company) {
		Company c1 = entityManager.find(Company.class,company.getId());
		if (c1 != null) {
			entityTransaction.begin();
			entityManager.remove(c1);
			entityTransaction.commit();
		}
	}

	public void updateById(Company company) {
		Company c2 = entityManager.find(Company.class, company.getId());
		if (c2 != null) {
			c2.setLocation("vileparle");
			c2.setName("nano");
			entityTransaction.begin();
			entityManager.merge(c2);
			entityTransaction.commit();
		}
	}

	public void getById(Company company) {
		Company c3 = entityManager.find(Company.class, company.getId());
		if (c3 != null) {
			System.out.println(c3.getId());
			System.out.println(c3.getLocation());
			System.out.println(c3.getName());
		}
	}
}
