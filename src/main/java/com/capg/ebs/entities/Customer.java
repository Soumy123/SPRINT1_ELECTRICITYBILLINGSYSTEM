package com.capg.ebs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {
	
	
	

		@Id
		private int customerid;
		private String customername;
		private double amount;
		public int getCid() {
			return customerid;
		}
		public void setCid(int cid) {
			this.customerid = customerid;
		}
		public String getCname() {
			return customername;
		}
		public void setCname(String cname) {
			this.customername = customername;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		

}
