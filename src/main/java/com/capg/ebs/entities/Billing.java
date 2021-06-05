package com.capg.ebs.entities;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.capg.ebs.entities.*;

@Entity
@Table(name="billing")

public class Billing {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
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
/*
 * public double getGrandTotal() { return grandTotal; } public void
 * setGrandTotal(double grandTotal) { this.grandTotal = grandTotal; }
 */

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
