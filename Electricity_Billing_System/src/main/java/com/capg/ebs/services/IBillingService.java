package com.capg.ebs.services;
import java.util.List;

import com.capg.ebs.dto.BillingDto;
import com.capg.ebs.entities.Billing;

public interface IBillingService {

	public BillingDto addBills(Billing bill);
	public void deleteBillsById(Long billId);
	public BillingDto updateBillsById(Long billId);
	public List<Billing> getAllBills();
	public BillingDto getBillById( Long billId);
}