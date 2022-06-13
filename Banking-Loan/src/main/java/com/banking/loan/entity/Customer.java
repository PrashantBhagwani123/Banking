package com.banking.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_detail")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Id")
	private int userId;
	
	@Column(name = "Customer_Name")
	private String customerName;
	
	@Column(name = "Phone_No")
	private String phoneNo;
	
	public Customer() {
		
	}

	public Customer(int userId, String customerName, String phoneNo) {
		super();
		this.userId = userId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", customerName=" + customerName + ", phoneNo=" + phoneNo + "]";
	}
	
	

}
