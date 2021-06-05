package com.capg.ebs.dto;
import java.time.LocalDate;

import com.capg.ebs.entities.*;


public class BillingDto {

private int billId;
//private int customerId;
private int billNum;
private int units;
public  double grandTotal=Units.calculateBillPay(units);
private LocalDate date;
private Customer customer;

public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getUnits() {
	return units;
}
public void setUnits(int units) {
	this.units = units;
}
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

 public double getGrandTotal() { return grandTotal; } public void
 setGrandTotal(double grandTotal) { this.grandTotal = grandTotal; }


public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
@Override
public String toString() {
	return "Billing [billId=" + billId + ", billNum=" + billNum + ", units consumed="+ units+", grandTotal=" + grandTotal + ", date=" + date + "]";
}


}




import org.springframework.stereotype.Component;



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

