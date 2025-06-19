package com.java.SpringDataJpaDateTime.service;

import java.util.List;

import com.java.SpringDataJpaDateTime.dao.CustomerInfo;

public interface ICustomerService {
	public String registerCustomer(CustomerInfo cus);
	public Iterable<CustomerInfo> getAllCustomerDetails();
}
