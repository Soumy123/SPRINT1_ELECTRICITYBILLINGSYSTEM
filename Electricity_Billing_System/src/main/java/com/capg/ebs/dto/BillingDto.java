package com.capg.ebs.dto;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.capg.ebs.entities.Customer;
import com.capg.ebs.entities.Units;




@Component

public class BillingDto {

	private Long billId;
	private Customer customer;
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
		return "Billing [billId=" + billId + ", billNum=" + billNum + ", units=" + units + ", grandTotal=" + grandTotal
				+ ", date=" + date + "]";

	}

}

