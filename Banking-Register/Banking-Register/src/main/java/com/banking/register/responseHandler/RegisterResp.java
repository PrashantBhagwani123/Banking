package com.banking.register.responseHandler;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegisterResp {

	public String requestType;
	@JsonProperty("Data")
	public Data data;
	public StatusDO statusDO;

	public RegisterResp() {

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
		public String data;

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
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
