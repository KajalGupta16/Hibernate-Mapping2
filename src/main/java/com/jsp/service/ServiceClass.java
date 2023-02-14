package com.jsp.service;

import com.jsp.dao.CompanyDao;
import com.jsp.dto.Company;
import com.jsp.dto.GST;

public class ServiceClass {
	CompanyDao companyDao = new CompanyDao();

	public void testSave(GST gst, Company company) {
		companyDao.testSave(gst, company);
	}

	public void deleteById(Company company) {
		companyDao.deleteById(company);
	}

	public void updateById(Company company) {
		companyDao.updateById(company);
	}

	public void getById(Company company) {
		companyDao.getById(company);
	}
}
