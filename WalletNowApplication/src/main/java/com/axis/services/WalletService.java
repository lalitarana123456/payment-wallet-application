package com.axis.services;

import java.math.BigDecimal;
import java.util.List;

import com.axis.model.Customer;
import com.axis.model.Wallet;

public interface WalletService {
	
	Customer createAccount(String name,String mobileNo,BigDecimal amount);

	
	Customer showBalance(String mobileNo);
	
	
	//what type of return is good here below method..??
	Customer fundTransfer(String sourceMobileNo, String targetMobileNo,BigDecimal amount);
	
	Customer depositAmount();
	
	List<Customer> getList();
	
	Customer updateAccount(Customer customer);
	
	Customer addMoney(Wallet wallet, Double amount);
}
