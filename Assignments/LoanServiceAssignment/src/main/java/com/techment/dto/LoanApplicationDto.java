package com.techment.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class LoanApplicationDto {

	
		private int Id; 
		private String bankName;
		private int minLoanAmount;
		private int maxLoanAmount;
		private int minInterestRate;
		private int minCreditScore;
		private int termLength;
		private int processingFee;
		private float rating;
		private String Status;
		
		

		public LoanApplicationDto() {
			super();
		}

		
		public LoanApplicationDto(String bankName, int minLoanAmount, int maxLoanAmount, int minInterestRate,
				int minCreditScore, int termLength, int processingFee, float rating, String status) {
			super();
			this.bankName = bankName;
			this.minLoanAmount = minLoanAmount;
			this.maxLoanAmount = maxLoanAmount;
			this.minInterestRate = minInterestRate;
			this.minCreditScore = minCreditScore;
			this.termLength = termLength;
			this.processingFee = processingFee;
			this.rating = rating;
			Status = status;
		}
		
		
		public LoanApplicationDto(int id, String bankName, int minLoanAmount, int maxLoanAmount, int minInterestRate,
				int minCreditScore, int termLength, int processingFee,float rating, String status) {
			super();
			Id = id;
			this.bankName = bankName;
			this.minLoanAmount = minLoanAmount;
			this.maxLoanAmount = maxLoanAmount;
			this.minInterestRate = minInterestRate;
			this.minCreditScore = minCreditScore;
			this.termLength = termLength;
			this.processingFee = processingFee;
			this.rating = rating;
			Status = status;
		}

		


		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public int getMinLoanAmount() {
			return minLoanAmount;
		}
		public void setMinLoanAmount(int minLoanAmount) {
			this.minLoanAmount = minLoanAmount;
		}
		public int getMaxLoanAmount() {
			return maxLoanAmount;
		}
		public void setMaxLoanAmount(int maxLoanAmount) {
			this.maxLoanAmount = maxLoanAmount;
		}
		public int getMinInterestRate() {
			return minInterestRate;
		}
		public void setMinInterestRate(int minInterestRate) {
			this.minInterestRate = minInterestRate;
		}
		public int getMinCreditScore() {
			return minCreditScore;
		}
		public void setMinCreditScore(int minCreditScore) {
			this.minCreditScore = minCreditScore;
		}
		public int getTermLength() {
			return termLength;
		}
		public void setTermLength(int termLength) {
			this.termLength = termLength;
		}
		public int getProcessingFee() {
			return processingFee;
		}
		public void setProcessingFee(int processingFee) {
			this.processingFee = processingFee;
		}
		public float getRating() {
			return rating;
		}
		public void setRating(float rating) {
			this.rating = rating;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		
		
		
	

}
