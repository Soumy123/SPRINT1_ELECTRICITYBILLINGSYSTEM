package com.capg.ebs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.ebs.entities.Billing;
import com.capg.ebs.repository.BillingRepository;

public class BillingServiceImpl implements IBillingService {
	
	@Autowired
     
	private BillingRepository repo;
	
	@Override
	public Billing addBills(Billing bill) {

		return repo.save(bill);
	}

	@Override
	public void deleteBills(Billing bill) {

		
	}

	@Override
	public Billing updateBills(Billing billName) {

		return repo.save(billName);
	}

	@Override
	public List<Billing> getAllBills() {
		
		return repo.findAll();
	}
	
	
	
	

}
