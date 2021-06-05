package com.capg.ebs.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.ebs.dto.BillingDto;
import com.capg.ebs.entities.Billing;

public class BillingUtils { 

	public static List<BillingDto> convertToBillingDtoList(List<Billing> list){
	List<BillingDto> dto = new ArrayList<BillingDto>();
		for(Billing billing :list)
			dto.add(convertToBillingDto(billing));
		return dto;

}

	public static BillingDto convertToBillingDto(Billing billing) {
		BillingDto billingdto=new BillingDto();
		billingdto.setBillId(billing.getBillId());
		billingdto.setBillnum(billing.getBillnum());
		billingdto.setDate(billing.getDate());
		billingdto.setUnits(billing.getUnits());
		billingdto.setCustomer(billing.getCustomer());
		//billingdto.setGrandTotal(billing.getGrandTotal());
		return billingdto;
	}
	
	public static Billing convertToBilling(BillingDto billingdto) {
		Billing billing=new Billing();
		billing.setBillId(billingdto.getBillId());
		billing.setBillnum(billingdto.getBillnum());
		billing.setDate(billingdto.getDate());
		billing.setUnits(billingdto.getUnits());
		billing.setCustomer(billingdto.getCustomer());
		//billing.setGrandTotal(billingdto.getGrandTotal());
		return billing;
		
	}
	
	

}

