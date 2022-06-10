package com.banking.account.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch_detail")
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Branch_Id")
	private int branchId;
	
	@Column(name = "Branch_Name")
	private String brachName;
	
	@Column(name = "Branch_Code")
	private String branchCode;
	
	@Column(name = "Branch_Address")
	private String branchAddress;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "City")
	private String city;
	
	public Branch() {
		
	}

	public Branch(int branchId, String brachName, String branchCode, String branchAddress, String state, String city) {
		super();
		this.branchId = branchId;
		this.brachName = brachName;
		this.branchCode = branchCode;
		this.branchAddress = branchAddress;
		this.state = state;
		this.city = city;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBrachName() {
		return brachName;
	}

	public void setBrachName(String brachName) {
		this.brachName = brachName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", brachName=" + brachName + ", branchCode=" + branchCode
				+ ", branchAddress=" + branchAddress + ", state=" + state + ", city=" + city + "]";
	}
	
	


}
