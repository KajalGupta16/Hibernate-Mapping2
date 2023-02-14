package com.jsp.controller;

import com.jsp.dto.Company;
import com.jsp.dto.GST;
import com.jsp.service.ServiceClass;

public class TestClass {
	public static void main(String[] args) {

		GST gst = new GST();
		Company company = new Company();
		gst.setGst_number("1.8");
		gst.setCompany(company);

		company.setName("ktm");
		company.setLocation("virar");
		company.setGst(gst);

		ServiceClass serviceClass = new ServiceClass();
		
		//to save
		
//		serviceClass.testSave(gst, company);

		//to delete by id
		
		company.setId(1);
//		serviceClass.deleteById(company);

		//to update by id
		
		company.setId(1);
//		serviceClass.updateById(company);

		//to get by id
		
		company.setId(1);
//		serviceClass.getById(company);

	}
}
