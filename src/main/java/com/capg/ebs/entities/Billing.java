package com.capg.ebs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="billing")

public class EntityBill {
@Id
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
	return billnum;
}
public void setBillnum(int billnum) {
	this.billnum = billnum;
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
@Override
public String toString() {
	return "entitybill [billId=" + billId + ", billnum=" + billnum + ", grandTotal=" + grandTotal + ", totalTaxAmount="
			+ totalTaxAmount + ", quantity=" + quantity + "]";
}



	
}
