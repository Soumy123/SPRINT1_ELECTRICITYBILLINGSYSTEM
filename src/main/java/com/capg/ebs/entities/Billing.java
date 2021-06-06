package com.capg.ebs.entities;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="billing")

public class Billing {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int billId;
//private Customer customer;
private int billNum;
private int units;
private  double grandTotal=Units.calculateBillPay(units);

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
private LocalDate date;

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

public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}

/*
 * public Customer getCustomer() { return customer; } public void
 * setCustomer(Customer customer) { this.customer = customer; }
 */

@Override
public String toString() {
	return "Billing [billId=" + billId + ", billNum=" + billNum + ", units=" + units + ", grandTotal=" + grandTotal
			+ ", date=" + date + "]";

}
}
