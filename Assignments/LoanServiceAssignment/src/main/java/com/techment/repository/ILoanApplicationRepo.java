package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.LoanApplication;

public interface ILoanApplicationRepo extends JpaRepository<LoanApplication, Integer> {

}
