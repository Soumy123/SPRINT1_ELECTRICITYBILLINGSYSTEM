package com.capg.ebs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ebs.entities.Customer;
import com.capg.ebs.services.ICustomerServiece;


@RestController
@RequestMapping("/ebs/cust")

public class CustomerController {

	
	@Autowired
	ICustomerServiece serviece;

	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return serviece.addCustomer(customer);
	}

	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return serviece.updateCustomer(customer);
	}

	@GetMapping("/Get")
	public ResponseEntity<List> getAllCustomers() {

		List<Customer> list = serviece.getAllCustomers();

		return new ResponseEntity<List>(list, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<String> deleteCustomerById(@PathVariable int id) {

		serviece.deleteCustomerById(id);

		return new ResponseEntity<String>("Employee Deleted", HttpStatus.OK);

	}

}
