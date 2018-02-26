package com.deloitte.crudapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.crudapp.dao.ClaimService;
import com.deloitte.crudapp.service.Claim;

@RestController
public class RestScenario {
	
	@Autowired
	ClaimService claimService;
	
	@GetMapping("/claim")
	List<Claim> getClaims(){
		return claimService.getClaims();
		
	}
	
	@PostMapping("/claim")
	void postClaims(@RequestBody Claim claim) {
		claimService.postClaims(claim);
	}
	
	@PutMapping("/claim/{id}")
	void updateClaims(@RequestBody Claim claim,@PathVariable Integer id) {
		claimService.updateClaim(id, claim);
	}

	@DeleteMapping("/claim/{id}")
	void deleteClaim(@PathVariable Integer id) {
		claimService.deleteClaim(id);
	}
}
