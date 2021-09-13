package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.techment.dto.LoanApplicationDto;
import com.techment.entity.LoanApplication;
import com.techment.repository.ILoanApplicationRepo;

@Service
public class LoanApplicationImpl implements ILoanApplicationService{

	@Autowired
	ILoanApplicationRepo LoanApplicationdao;
	
	@Override
	public String saveLoanApplicationToDb(LoanApplicationDto applicationDto) {
		LoanApplication application = new LoanApplication(applicationDto.getBankName(),
				applicationDto.getMinCreditScore(), applicationDto.getMaxLoanAmount(),
				applicationDto.getMinInterestRate(), applicationDto.getMinCreditScore(),
				applicationDto.getTermLength(), applicationDto.getProcessingFee(), applicationDto.getRating(), applicationDto.getStatus());	
		
		LoanApplicationdao.save(application);
		return "Loan Application Added Sucessfully";
	}

	@Override
	public LoanApplicationDto approveLoanApplication(int id) {
		
		LoanApplication application = LoanApplicationdao.findById(id).get();
		application.setStatus("Approved");
		LoanApplicationdao.save(application);
		LoanApplicationDto applicationDto = new LoanApplicationDto(application.getId(), application.getBankName(), application.getMinLoanAmount(), application.getMaxLoanAmount(), application.getMinInterestRate(), application.getMinCreditScore(), application.getTermLength(), application.getProcessingFee(), application.getRating(),application.getStatus());
		
		return applicationDto;
	}

	@Override
	public LoanApplicationDto rejectLoanApplication(int id) {

		LoanApplication application = LoanApplicationdao.findById(id).get();
		application.setStatus("Reject");
		LoanApplicationdao.save(application);
		LoanApplicationDto applicationDto = new LoanApplicationDto(application.getId(), application.getBankName(), application.getMinLoanAmount(), application.getMaxLoanAmount(), application.getMinInterestRate(), application.getMinCreditScore(), application.getTermLength(), application.getProcessingFee(), application.getRating(),application.getStatus());
		
		return applicationDto;
		
	}

	

}
