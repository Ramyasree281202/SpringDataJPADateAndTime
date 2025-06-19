package com.java.SpringDataJpaDateTime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.SpringDataJpaDateTime.dao.CustomerInfo;
import com.java.SpringDataJpaDateTime.dao.ICustomerRepo;
@Service
public class CustomerServiceImp implements ICustomerService{
	@Autowired
	private ICustomerRepo repo;
	@Override
	public String registerCustomer(CustomerInfo cus) {
		Integer id = repo.save(cus).getId();
		return "New Customer has registered with id : "+id;
	}
	@Override
	public Iterable<CustomerInfo> getAllCustomerDetails() {
		
		return repo.findAll();
	}

}
