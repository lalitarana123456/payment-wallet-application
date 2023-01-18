package com.axis.services;

import com.axis.model.BillPayment;

public interface BillPaymentService {
	
	BillPayment addBillPayment(BillPayment billPayment);
	
	BillPayment viewBillPayment(BillPayment billPayment);

}
