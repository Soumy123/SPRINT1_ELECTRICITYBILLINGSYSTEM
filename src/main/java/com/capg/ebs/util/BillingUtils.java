package com.capg.ebs.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.ebs.entities.Billing;
import com.capg.ebs.model.BillingDto;

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
		billingdto.setGrandTotal(billing.getGrandTotal());
		return billingdto;
	}
	
	public static Billing convertToBilling(BillingDto billingdto) {
		Billing billing=new Billing();
		billing.setBillId(billing.getBillId());
		billing.setBillnum(billing.getBillnum());
		billing.setDate(billing.getDate());
		billing.setGrandTotal(billing.getGrandTotal());
		return billing;
	}
	
	

}
