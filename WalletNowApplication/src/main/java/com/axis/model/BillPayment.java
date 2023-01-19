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
public class BillPayment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer billId;
	
	@NotNull
	private BillType biilType;
	
	@NotNull
	private Double amount;
	
	@NotNull
	private LocalDate paymentDate;
	
	@ManyToOne
	private Wallet wallet;

}
