package com.capg.ebs.services;
import java.util.List;

import com.capg.ebs.dto.BillingDto;
import com.capg.ebs.entities.Billing;

public interface IBillingService {
	
	public BillingDto addBills(Billing bill);
        public void deleteBills(Billing bill);
        public BillingDto updateBills(Billing billName);
	public List<BillingDto> getAllBills();
}
