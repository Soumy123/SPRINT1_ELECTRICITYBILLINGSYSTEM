package com.capg.ebs.entities;
import java.time.LocalDate
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
	return "entitybill [billId=" + billId + ", billnum=" + billNum + ", grandTotal=" + grandTotal + ", totalTaxAmount="
			+ totalTaxAmount + ", quantity=" + quantity + "]";
}



	
}
