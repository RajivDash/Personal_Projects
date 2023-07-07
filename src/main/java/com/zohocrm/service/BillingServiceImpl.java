package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingrepo;
	
	
	@Override
	public Billing saveBill(Billing billing) {
		Billing bill = billingrepo.save(billing);
		return bill;
	}

}
