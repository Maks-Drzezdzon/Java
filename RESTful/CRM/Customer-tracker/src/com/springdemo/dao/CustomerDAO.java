package com.springdemo.dao;

import java.util.List;

import com.springdemo.entity.Customer;

//data access object
public interface CustomerDAO {
	public List<Customer> getCustomers();
}
