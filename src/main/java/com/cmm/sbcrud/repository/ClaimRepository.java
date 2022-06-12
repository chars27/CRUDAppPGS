package com.cmm.sbcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmm.sbcrud.entity.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

	public Claim findBysubstatusName(String input);
}
