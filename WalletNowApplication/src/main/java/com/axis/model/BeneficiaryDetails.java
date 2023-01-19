package com.axis.model;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

//some validation are left
public class BeneficiaryDetails {
	
	@Id
	private String MobileNumber;
	private String name;
	

}
