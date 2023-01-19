package com.axis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.exception.BankAccountException;
import com.axis.model.BankAccount;
import com.axis.model.Wallet;
import com.axis.repository.BankAccountDAO;


@Service
public class AccountServicesImpl implements AccountService{
	
	@Autowired
	private BankAccountDAO bankAccountDao;

	@Override
	public Wallet addAccount(BankAccount bankAccount) {
		
		if(bankAccount==null) throw new BankAccountException("Please provide proper details");
		
		bankAccountDao.save(bankAccount);
		
		return null;
	}

	@Override
	public Wallet removeAccount(BankAccount bankAccount) {
		
		return null;
	}

	@Override
	public BankAccount viewAccount(Wallet wallet) {
		
		return null;
	}

	@Override
	public List<BankAccount> viewAllAccounts(Wallet wallet) {
		
		return null;
	}

}
