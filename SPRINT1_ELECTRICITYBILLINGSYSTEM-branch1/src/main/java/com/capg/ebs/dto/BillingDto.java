package com.capg.ebs.dto;
import java.time.LocalDate;

import javax.persistence.CascadeType;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import com.capg.ebs.entities.Customer;




@Entity
@Table(name="billing")

public class BillingDTO {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@NotNull(message="Bill Id cannot be null")
private Long billId;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="customerId")
private Customer customer;
@NotEmpty(message="Bill Num cannot be Empty")
private int billNum;
@Min(value=10,message="should be greater than 10")
private static int units;

private LocalDate date;
private  double grandTotal=calculateBillPay(units);

public int getBillNum() {
	return billNum;
}
public void setBillNum(int billNum) {
	this.billNum = billNum;
}
public static int getUnits() {
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

public static double calculateBillPay(int units) {
	   
    units=getUnits();
	   double billpay=0;
	
    if(units<100)
	 billpay= units*1.20;

	    else if(units<300 &&units>100)
	billpay=100*1.20+(units-100)*2;

 else if(units>300)
	billpay=100*1.20+200 *2+(units-300)*3;
return billpay;
    }

@Override
public String toString() {
	return "Billing [billId=" + billId + ", billNum=" + billNum + ", units=" + units + ", grandTotal=" + grandTotal
			+ ", date=" + date + "]";

}
}

