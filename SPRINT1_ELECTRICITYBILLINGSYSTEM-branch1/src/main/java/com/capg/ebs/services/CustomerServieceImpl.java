package com.capg.ebs.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.ebs.entities.Customer;
import com.capg.ebs.exception.CustomerException;
import com.capg.ebs.repository.ICustomerRepository;
import com.capg.ebs.util.CustomerUtils;

@Service
public class CustomerServieceImpl implements ICustomerServiece {

	@Autowired
	ICustomerRepository repo;
	
	   private static final Logger logger = LoggerFactory.getLogger(CustomerServieceImpl.class);

	
	
	@Override
	public Customer addCustomer(Customer customer) {
		String name=customer.getCustomerName();
		if(name.length()<=5) {
			logger.warn("Name Must be Greater than four charecters");
		}
		else {
			new CustomerException("Invalid Name");
		}
	    
		return CustomerUtils.convertToCustomerDto(repo.save(customer));
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		String name=customer.getCustomerName();
		if(name.length()>=5 && name.length()<25) {
			logger.warn("Name Must be Greater than four charecters and less than 25 charecters");
		}
		else {
			new CustomerException("Invalid Name");
				
			
		
		}
	return CustomerUtils.convertToCustomerDto(repo.save(customer));
	}

	@Override
	public Customer getCustomerById(int cid) {
		if(cid<1000) {
			logger.warn("The Customer Id Must Be 4 Digits");
		}
		else {
			new CustomerException("Invalid Id");
		}
		
		return CustomerUtils.convertToCustomer(repo.getById(cid));
	}

	@Override
	public void deleteCustomerById(int cid) {
		repo.deleteById(cid);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return CustomerUtils.convertToCustomerDTOList(repo.findAll());
	}

}
