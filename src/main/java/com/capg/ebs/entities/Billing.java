package com.capg.ebs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="billing")

public class Billing {
@Id
private int billId;
private int billNum;
private  double grandTotal;
private double totalTaxAmount;
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


@Override
public String toString() {
	return "entitybill [billId=" + billId + ", billnum=" + billNum + ", grandTotal=" + grandTotal + ", totalTaxAmount="
			+ totalTaxAmount +  "]";
}

}
