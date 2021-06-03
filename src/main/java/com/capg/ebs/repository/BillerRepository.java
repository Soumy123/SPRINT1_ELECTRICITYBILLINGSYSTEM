package com.capg.ebs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ebs.entities.EntityBill;


public interface BillerRepository extends JpaRepository<EntityBill,Long>{
	
	

}
