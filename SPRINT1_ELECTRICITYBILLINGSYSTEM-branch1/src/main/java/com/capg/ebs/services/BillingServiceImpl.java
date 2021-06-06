package com.capg.ebs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.ebs.dto.BillingDto;
import com.capg.ebs.entities.Billing;
import com.capg.ebs.repository.BillingRepository;

public class BillingServiceImpl implements IBillingService {
	
	@Autowired
     
	private BillingRepository repo;

	@Override
	public BillingDto addBills(Billing bill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBills(Billing bill) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BillingDto updateBills(Billing billName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BillingDto> getAllBills() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
