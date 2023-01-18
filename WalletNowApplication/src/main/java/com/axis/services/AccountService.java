package com.axis.services;

import java.util.List;

import com.axis.model.BankAccount;
import com.axis.model.Wallet;

public interface AccountService {
	
	Wallet addAccount(BankAccount bankAccount);
	
	
	Wallet removeAccount(BankAccount bankAccount);
	
	
	BankAccount viewAccount(Wallet wallet);
	
	
	List<BankAccount> viewAllAccounts(Wallet wallet);

}
