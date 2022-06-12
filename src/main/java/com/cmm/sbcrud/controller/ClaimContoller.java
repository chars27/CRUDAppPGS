package com.cmm.sbcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmm.sbcrud.entity.Claim;
import com.cmm.sbcrud.service.ClaimService;

@RestController
@RequestMapping("/api")
public class ClaimContoller {

	@Autowired
	ClaimService claimService;
	
	@GetMapping("/getStatus")
	public String getClaimStatus(@RequestParam("input") String input) {
		System.out.println(input);
		return claimService.getClaimStatus(input);
	}
	
	@PostMapping("/save")
	public Claim saveClaim(@RequestBody Claim claim) {
		
		return claimService.saveClaim(claim);
	}
}
