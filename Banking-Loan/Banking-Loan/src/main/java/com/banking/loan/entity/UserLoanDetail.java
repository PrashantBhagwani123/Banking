package com.banking.loan.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_loan_detail")
public class UserLoanDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Loan_Id")
	private int userLoanId;
	
	@Column(name = "Loan_Account_Number")
	private String loanAccountNumber;
	
	@Column(name = "Loan_Amount")
	private String loanAmount;
	
	@Column(name = "Issue_Date")
	private Date issueDate;
	
	@Column(name = "Due_Date")
	private Date dueDate;
	
	@Column(name = "Loan_Id")
	private int loanId;
	
	@Column(name = "Customer_Name")
	private String customerName;
	
	@Column(name = "User_Id")
	private int userId;

	public UserLoanDetail() {
		
	}

	public UserLoanDetail(String loanAccountNumber, String loanAmount, Date issueDate, Date dueDate, int loanId,
			String customerName, int userId) {
		super();
		this.loanAccountNumber = loanAccountNumber;
		this.loanAmount = loanAmount;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
		this.loanId = loanId;
		this.customerName = customerName;
		this.userId = userId;
	}

	public int getUserLoanId() {
		return userLoanId;
	}

	public void setUserLoanId(int userLoanId) {
		this.userLoanId = userLoanId;
	}

	public String getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(String loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserLoanDetail [userLoanId=" + userLoanId + ", loanAccountNumber=" + loanAccountNumber + ", loanAmount="
				+ loanAmount + ", issueDate=" + issueDate + ", dueDate=" + dueDate + ", loanId=" + loanId
				+ ", customerName=" + customerName + ", userId=" + userId + "]";
	}
	
}
