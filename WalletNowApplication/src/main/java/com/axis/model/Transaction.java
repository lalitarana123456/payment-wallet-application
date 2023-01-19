package com.axis.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


//some validation are left
public class Transaction {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transactionId;
	
	@NotNull
	private String transactionType;
	
	@NotNull
	private LocalDate transactionDate;
	
	@NotNull
	private Double amount;
	
	@NotNull
	private String description;
	
	@ManyToOne
	private Wallet wallet;
	

}
