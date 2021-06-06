package com.capg.ebs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="Payments")
	public class Payment {
		

		@Id
		private long creditcardNo;
		private long debitcardNo;
		private long netbanking;
		public long getCreditcardNo() {
			return creditcardNo;
		}
		public void setCreditcardNo(long creditcardNo) {
			this.creditcardNo = creditcardNo;
		}
		public long getDebitcardNo() {
			return debitcardNo;
		}
		public void setDebitcardNo(long debitcardNo) {
			this.debitcardNo = debitcardNo;
		}
		public long getNetbanking() {
			return netbanking;
		}
		public void setNetbanking(long netbanking) {
			this.netbanking = netbanking;
		}
		
		

	}

