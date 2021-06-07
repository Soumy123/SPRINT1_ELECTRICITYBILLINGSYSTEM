package com.capg.ebs.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capg.ebs.services.CustomerServieceImpl;

public class CustomerException extends Exception{
	 private static final Logger logger = LoggerFactory.getLogger(CustomerException.class);
	public CustomerException(String message) {
		
		logger.warn(message);
		
	}
	
	
	
	
	

}
