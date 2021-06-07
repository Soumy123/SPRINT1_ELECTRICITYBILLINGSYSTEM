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

import com.capg.ebs.dto.BillingDto;
import com.capg.ebs.entities.Billing;
import com.capg.ebs.services.BillingServiceImpl;


@RestController
@RequestMapping("/api/billing")

public class BillingController {

	@Autowired

	private BillingServiceImpl service;
	@PostMapping("/addbill")
	public BillingDto addBills(@RequestBody Billing billing) {
		return service.addBills(billing);

	}
	@PutMapping("/update/{id}")
	public BillingDto updateBillsById(@PathVariable Long billId) {

		return service.updateBillsById(billId);
	}
	@GetMapping("/viewall")
	public List<Billing> getAllBills() {
		return service.getAllBills();
	}
	@GetMapping("/view/{id}")
	public BillingDto getBillById(@PathVariable Long billId) {
		return service.getBillById(billId);

	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteEmployeById(@PathVariable Long id) {
		service.deleteBillsById(id);
		return new ResponseEntity<String>("Bill Deleted Successfully",HttpStatus.ACCEPTED);
	}


}
