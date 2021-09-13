package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.LoanApplicationDto;
import com.techment.exception.LoanApplicationNotFound;
import com.techment.service.ILoanApplicationService;

@RestController
@RequestMapping(value = "/loanApplication")
public class LoanApplicationController {
	
	@Autowired
	ILoanApplicationService loanApplicationImpl;
	
	@PostMapping("/applyLoan")
	public ResponseEntity<String> LoanApplication(@RequestBody LoanApplicationDto applicationDto)
	{
		try
		{
			loanApplicationImpl.saveLoanApplicationToDb(applicationDto);
			return new ResponseEntity<String>("Data will be load",HttpStatus.OK);
		}
		catch (Exception e) {
		
			return null;
		}
		
	}
	
	@PutMapping(value = "/approveApplicationById/{id}")
	public ResponseEntity<LoanApplicationDto> ApproveApplication(@PathVariable int id)
	{
		try {
			LoanApplicationDto applicationDto = loanApplicationImpl.approveLoanApplication(id);
			return new ResponseEntity<LoanApplicationDto>(applicationDto,HttpStatus.ACCEPTED);
			
		}
		catch(Exception e)
		{
			throw new LoanApplicationNotFound("Id not found: Not approved");	
		}
	}
	

	@PutMapping(value = "/rejectApplicationById/{id}")
	public ResponseEntity<LoanApplicationDto> RejectApplication(@PathVariable int id)
	{
		try 
		{
			LoanApplicationDto applicationDto = loanApplicationImpl.rejectLoanApplication(id);
			return new ResponseEntity<LoanApplicationDto>(applicationDto,HttpStatus.ACCEPTED);
			
		}
		catch(Exception e)
		{
			throw new LoanApplicationNotFound("Loan id not found: Application Application");	
		}
	}
	
	
		
	

}
