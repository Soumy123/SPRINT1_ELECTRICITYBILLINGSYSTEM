package com.capg.ebs.services;
import java.util.List;
import com.capg.ebs.entities.Billing;

public interface IBillingService {
	
	public Billing addbills(Billing bill);
        public void deletebills(Billing bill);
        public Billing updatebills(Billing billName);
	public List<Billing> getAllBills();
}
