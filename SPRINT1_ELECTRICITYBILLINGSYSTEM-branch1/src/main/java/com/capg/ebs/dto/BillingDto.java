package com.capg.ebs.dto;
import java.time.LocalDate;

import javax.persistence.CascadeType;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import com.capg.ebs.entities.Customer;




public class BillingDto {

private Long billId;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="customerId")
private Customer customer;
private int billNum;
private int units;

private LocalDate date;
private  double grandTotal=UnitsDto.calculateBillPay(units);

public int getBillNum() {
	return billNum;
}
public void setBillNum(int billNum) {
	this.billNum = billNum;
}
public int getUnits() {
	return units;
}
public void setUnits(int units) {
	this.units = units;
}


public Long getBillId() {
	return billId;
}
public void setBillId(Long billId) {
	this.billId = billId;
}
public int getBillnum() {
	return billNum;
}
public void setBillnum(int billnum) {
	this.billNum = billnum;
}


public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}

public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@Override
public String toString() {
	return "BillingDto [billId=" + billId + ", customer=" + customer + ", billNum=" + billNum + ", units=" + units
			+ ", date=" + date + ", grandTotal=" + grandTotal + "]";
}


}

