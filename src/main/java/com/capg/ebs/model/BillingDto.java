package com.capg.ebs.model;




import org.springframework.stereotype.Component;

import com.capg.ebs.entities.Billing;

@Component

public class BillingDto {

	private int billId;
	private int billNum;
	private  double grandTotal;
	private double totalTaxAmount;
	private int quantity;
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getBillnum() {
		return billNum;
	}
	public void setBillnum(int billnum) {
		this.billNum = billnum;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public double getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(double totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
