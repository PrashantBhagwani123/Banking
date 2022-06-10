package com.banking.account.responseHandler;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountResp {

	public String requestType;
	@JsonProperty("Data")
	public Data data;
	public StatusDO statusDO;

	public AccountResp() {

	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public StatusDO getStatusDO() {
		return statusDO;
	}

	public void setStatusDO(StatusDO statusDO) {
		this.statusDO = statusDO;
	}

	public class Data {
		
		private int branchId;		
		private String brachName;		
		private String branchCode;		
		private String branchAddress;
		
		
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
	}

	public class StatusDO {
		public int statusCode;
		public String statusMsg;

		public int getStatusCode() {
			return statusCode;
		}

		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}

		public String getStatusMsg() {
			return statusMsg;
		}

		public void setStatusMsg(String statusMsg) {
			this.statusMsg = statusMsg;
		}

	}

}
