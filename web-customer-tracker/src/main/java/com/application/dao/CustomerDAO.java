package com.application.dao;

import com.application.entity.Customer;

import java.util.List;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
