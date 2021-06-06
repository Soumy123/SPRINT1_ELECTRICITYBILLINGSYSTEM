package com.capg.ebs.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.ebs.dto.BillingDto;
import com.capg.ebs.entities.Billing;
import com.capg.ebs.exception.BillingNotFoundException;
import com.capg.ebs.repository.BillingRepository;
import com.capg.ebs.util.BillingUtils;

public class BillingServiceImp implements IBillingService {
	
	@Autowired
     
	private BillingRepository billingrepository;

	@Override
	public BillingDto addBills(Billing billing) {
	Billing bill =	billingrepository.save(billing);
	BillingDto billingdto=BillingUtils.convertToBillingDto(billing);
	return billingdto;
	
	}

	@Override
	public void deleteBillsById(Long billId) {
		Billing bill=billingrepository.findById(billId).orElse(null);
		if(bill!=null) {
			billingrepository.deleteById(billId);
		}
		else
			throw new BillingNotFoundException();
		
	}

	@Override
	public BillingDto updateBillsById(Long billId) {
		Billing billing=billingrepository.findById(billId).orElse(null);
		if(billing!=null) {
			Billing billing2=new Billing();
			Billing bill=billingrepository.save(billing2);
			BillingDto billingdto=BillingUtils.convertToBillingDto(billing2);
			return billingdto;
		}
		else 
			throw new BillingNotFoundException();
	}

	@Override
	public List<Billing> getAllBills() {
		List<Billing> billing=billingrepository.findAll();
		
		return billing;
	}

	@Override
	public BillingDto getBillById(Long billId) {
		Billing billing=billingrepository.findById(billId).orElse(null);
		if(billing!=null) {
			Billing billing1=billingrepository.getById(billId);
			BillingDto billingdto=BillingUtils.convertToBillingDto(billing1);
			return billingdto;
		}
		else
			throw new BillingNotFoundException();
		
	}

	
	
	
	

}
