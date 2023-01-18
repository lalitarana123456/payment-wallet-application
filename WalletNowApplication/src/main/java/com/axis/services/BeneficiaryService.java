package com.axis.services;

import java.util.List;

import com.axis.model.BeneficiaryDetails;
import com.axis.model.Customer;

public interface BeneficiaryService {
	
	BeneficiaryDetails addBeneficiary(BeneficiaryDetails benefiaryDetail);

	
	BeneficiaryDetails deleteBeneficiary(BeneficiaryDetails benefiaryDetail);
	
	
	BeneficiaryDetails viewBeneficiary(String mobileNumber);
	
	List<BeneficiaryDetails> viewAllBeneficiary(Customer customer);
}
