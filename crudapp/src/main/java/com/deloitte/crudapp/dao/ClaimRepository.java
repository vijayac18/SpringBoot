package com.deloitte.crudapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.deloitte.crudapp.service.Claim;

public interface ClaimRepository extends CrudRepository<Claim, Integer> {
	

}
