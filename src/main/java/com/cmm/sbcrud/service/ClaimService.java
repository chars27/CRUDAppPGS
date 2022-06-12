package com.cmm.sbcrud.service;

import com.cmm.sbcrud.entity.Claim;

public interface ClaimService {

	String getClaimStatus(String input);

	Claim saveClaim(Claim claim);

}
