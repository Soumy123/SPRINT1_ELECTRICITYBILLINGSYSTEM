package com.capg.ebs.services;
import java.util.List;
import com.capg.ebs.entities.EntityBill;

public interface IBillingService {
	
	public EntityBill addbills(EntityBill bill);
        public EntityBill deletebills(EntityBill bill);
        public EntityBill updatebills(EntityBill billName);
	public List<EntityBill> getAllBills();
}
