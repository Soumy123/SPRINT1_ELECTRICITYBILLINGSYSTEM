package com.capg.ebs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.ebs.services.BillingServiceImpl;

@RestController
@RequestMapping("/api")

public class ServiceController {

	@Autowired
	
	private BillingServiceImpl service;
}
