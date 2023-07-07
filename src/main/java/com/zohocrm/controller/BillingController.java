package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.zohocrm.entities.Billing;
import com.zohocrm.service.BillingService;


@Controller
public class BillingController {


	@Autowired
	private BillingService billingservice;
	
	
	
	@PostMapping("generate")
	public String getGenerateBill(@ModelAttribute("billing") Billing billing,Model model) {
		Billing bills = billingservice.saveBill(billing);
		model.addAttribute("bills", bills);
		return "Generate_Info";
	}
	
}
