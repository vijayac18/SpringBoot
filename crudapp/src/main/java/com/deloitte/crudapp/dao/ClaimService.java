package com.deloitte.crudapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.crudapp.service.Claim;

@Service
public class ClaimService {
	
	@Autowired
	private ClaimRepository claimRepository;
	
	public List<Claim> getClaims(){
		List<Claim> claims = new ArrayList<Claim>();
		claimRepository.findAll().forEach(claims::add);
		return claims;
		
	}
	
	public void postClaims(Claim claim) {
		claimRepository.save(claim);
	}
	
	public void updateClaim(Integer id,Claim claim) {
		claimRepository.save(claim);
	}
	
	public void deleteClaim(Integer id) {
		claimRepository.delete(id);
	}

}
