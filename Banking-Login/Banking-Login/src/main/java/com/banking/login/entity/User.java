package com.banking.login.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer_detail")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_Id")
	private int userId;

	@Column(name = "Customer_Name")
	private String customerName;

	@Column(name = "User_Name")
	private String userName;

	@Column(name = "Password")
	private String password;

	@Column(name = "Phone_No")
	private String phoneNo;

	@Column(name = "Address")
	private String address;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "DOB")
	private String dob;

	@Column(name = "Enabled")
	private boolean enabled;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "User_Id"), inverseJoinColumns = @JoinColumn(name = "Role_Id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User(String customerName, String userName, String password, String phoneNo, String address, String gender,
			String dob, boolean enabled) {
		super();
		this.customerName = customerName;
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
		this.gender = gender;
		this.dob = dob;
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", customerName=" + customerName + ", userName=" + userName + ", password="
				+ password + ", phoneNo=" + phoneNo + ", address=" + address + ", gender=" + gender + ", dob=" + dob
				+ ", enabled=" + enabled + "]";
	}

}
