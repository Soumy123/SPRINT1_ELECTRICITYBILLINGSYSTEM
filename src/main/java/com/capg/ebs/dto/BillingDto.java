package com.capg.ebs.dto;
import java.time.LocalDate;



public class BillingDto {

private int billId;
private int billNum;
private  double grandTotal;
private LocalDate date;
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

public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
@Override
public String toString() {
	return "Billing [billId=" + billId + ", billNum=" + billNum + ", grandTotal=" + grandTotal + ", date=" + date + "]";
}


	
}
