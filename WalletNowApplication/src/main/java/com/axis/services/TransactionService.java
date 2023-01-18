package com.axis.services;

import java.time.LocalDate;
import java.util.List;

import com.axis.model.Transaction;
import com.axis.model.Wallet;

public interface TransactionService {
	
	Transaction addTransaction(Transaction transaction);
	
	//it could be list ????
	Transaction viewAllTranscation(Wallet wallet);
	
	
	List<Transaction> viewTransactionByDate(LocalDate from,LocalDate to);
	
	
	List<Transaction> viewAllTransaction(String type);

}
