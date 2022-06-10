package com.banking.account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.account.requestMapper.UserAccountDetailMapper;
import com.banking.account.responseHandler.AccountResp;

@RestController
public interface AccountDetail {

	@PostMapping("/addUserAccount")
	public ResponseEntity<AccountResp> addUserAccount(UserAccountDetailMapper userAccountDetailMapper);

	@GetMapping("/getBranchDetails")
	public ResponseEntity<AccountResp> getBranchDetails(String state, String city);

}
