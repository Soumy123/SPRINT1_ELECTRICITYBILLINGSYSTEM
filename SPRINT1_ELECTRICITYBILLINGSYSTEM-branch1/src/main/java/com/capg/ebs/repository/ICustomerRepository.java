package com.capg.ebs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ebs.dto.CustomerDto;
import com.capg.ebs.entities.Customer;

public interface ICustomerRepository extends JpaRepository<CustomerDto, Integer> {
	  
	public CustomerDto save(Customer customer);
	public List<CustomerDto> findAll();
}