package com.axis.services;

import java.util.List;

import com.axis.exception.BankAccountException;
import com.axis.exception.WalletException;
import com.axis.model.BankAccount;
import com.axis.model.Wallet;

public interface AccountService {
	
	Wallet addAccount(BankAccount bankAccount)throws BankAccountException;
	
	
	Wallet removeAccount(BankAccount bankAccount)throws BankAccountException;
	
	
	BankAccount viewAccount(Wallet wallet)throws BankAccountException,WalletException;
	
	
	List<BankAccount> viewAllAccounts(Wallet wallet);

}
