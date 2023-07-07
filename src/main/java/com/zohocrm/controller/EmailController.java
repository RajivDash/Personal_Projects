package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.Dto.Email;
import com.zohocrm.utility.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailservice;
	
	@PostMapping("processEmail")
	public String getEmail(@RequestParam("emailId") String emailId, Model model) {
		model.addAttribute("emailId", emailId);
		return "Compose_Email";
	}
	
	
	@PostMapping("triggerEmail")
	public String triggerEmail(Email email,Model model) {
		emailservice.sendEmail(email.getEmailId(),email.getSubject(),email.getContent());
		model.addAttribute("msg", "EMAIL SENT!!!");
		return "Compose_Email";
	}
}
