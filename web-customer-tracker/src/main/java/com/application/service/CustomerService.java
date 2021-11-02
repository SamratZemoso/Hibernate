package com.application.service;

import com.crud.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
