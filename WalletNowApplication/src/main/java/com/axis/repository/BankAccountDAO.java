package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.model.BankAccount;

@Repository
public interface BankAccountDAO extends JpaRepository<BankAccount, Integer>{

}
