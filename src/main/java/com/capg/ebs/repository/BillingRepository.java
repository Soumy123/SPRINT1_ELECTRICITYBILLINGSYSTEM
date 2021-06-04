package com.capg.ebs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ebs.entities.Billing;


public interface BillerRepository extends JpaRepository<Billing,Long>{
	
	

}
