package com.capg.ebs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.ebs.entities.entitybill;

public interface Ibiller extends JpaRepository<entitybill,Long>{
	
	

}
