package com.capg.ebs.services;

import java.util.List;

import com.capg.ebs.entities.Customer;

public interface ICustomerServiece {

	public Customer addCustomer(Customer customer);

	public Customer updateCustomer(Customer cust);

	public Customer getCustomerById(int cid);

	public void deleteCustomerById(int cid);

	public List<Customer> getAllCustomers();

}
