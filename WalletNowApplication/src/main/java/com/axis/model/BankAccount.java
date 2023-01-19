package com.axis.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BankAccount {
	
	
	@Id
	private Integer AccountNumber;
	
	@NotNull(message = "IFSC Code is mandatory")
	private String IfscCode;
	
	@NotNull(message = "BankName is mandatory")
	private String bankNmae;
	
	@NotNull
	@Min(value = 1000)
	private Double balance;
	
    @OneToOne
	private Wallet wallet;
	

}
