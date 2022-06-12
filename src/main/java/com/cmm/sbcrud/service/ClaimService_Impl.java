package com.cmm.sbcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmm.sbcrud.entity.Claim;
import com.cmm.sbcrud.repository.ClaimRepository;

@Service
public class ClaimService_Impl implements ClaimService {

	@Autowired
	ClaimRepository claimRepository;
	
	
	@Override
	public String getClaimStatus(String input) {
		// TODO Auto-generated method stub
		return claimRepository.findBysubstatusName(input).getDraftedMessage();
	}


	@Override
	public Claim saveClaim(Claim claim) {
		// TODO Auto-generated method stub
		return claimRepository.save(claim);
	}	
}
