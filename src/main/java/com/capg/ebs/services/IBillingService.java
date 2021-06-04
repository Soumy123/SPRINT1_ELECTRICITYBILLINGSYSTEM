package com.capg.ebs.services;
import java.util.List;
import com.capg.ebs.entities.Billing;

public interface IBillingService {
	
	public Billing addBills(Billing bill);
        public void deleteBills(Billing bill);
        public Billing updateBills(Billing billName);
	public List<Billing> getAllBills();
}
