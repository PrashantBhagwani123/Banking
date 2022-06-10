package com.banking.account.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_account_detail")
public class UserAccountDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Account_Id")
	private int userAccountId;
	
	@Column(name = "Account_Number")
	private String accountNumber;

	@Column(name = "Customer_Id")
	private String customerId;

	@Column(name = "Account_Balance")
	private String accountBalance;

	@Column(name = "User_Id")
	private int userId;
	
	@Column(name = "Account_Id")
	private int accountId;
	
	@Column(name = "Branch_Id")
	private int branchId;
	
   public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

public UserAccountDetail() {	   
   }

   public UserAccountDetail(String accountNumber, String customerId, String accountBalance, int userId, int accountId, int branchId) {
	super();
	this.accountNumber = accountNumber;
	this.customerId = customerId;
	this.accountBalance = accountBalance;
	this.userId = userId;
	this.accountId = accountId;
	this.branchId = branchId;
   }

	public int getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "UserAccountDetail [userAccountId=" + userAccountId + ", accountNumber=" + accountNumber
				+ ", customerId=" + customerId + ", accountBalance=" + accountBalance + ", userId=" + userId
				+ ", accountId=" + accountId + ", branchId=" + branchId + "]";
	}
  
	
}
