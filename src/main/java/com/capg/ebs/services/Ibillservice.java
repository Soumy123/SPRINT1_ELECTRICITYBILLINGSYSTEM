package com.capg.ebs.services;

import com.capg.ebs.entities.entitybill;

public interface Ibillservice {
	
	public entitybill addbills(entitybill bill);
    public entitybill deletebills(entitybill bill);
    public entitybill updatebills(entitybill billName);
}
