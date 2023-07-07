package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Convert;
import com.zohocrm.entities.Lead;
import com.zohocrm.service.ConvertService;
import com.zohocrm.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private ConvertService convertservice;

	@Autowired
	private LeadService leadservice;
	
	@GetMapping("viewPage")
	public String createPage() {
		return "Lead_Page";
	}
	
	@PostMapping("save")
	public String saveLead(@ModelAttribute("lead") Lead lead ,Model model) {
		leadservice.saveLead(lead);
		model.addAttribute("lead", lead);
		return "Lead_Info";
	}
	
	@PostMapping("convertInfo")
	public String convertLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadservice.findById(id);
		
		Convert ct = new Convert();
		
		ct.setFirstName(lead.getFirstName());
		ct.setLastName(lead.getLastName());
		ct.setEmailId(lead.getEmailId());
		ct.setMobileNo(lead.getMobileNo());
		ct.setSource(lead.getSource());
		
		convertservice.saveConfirms(ct);
		
		leadservice.deleteById(id);
		
		List<Convert> converts = convertservice.getAllList();
		model.addAttribute("converts", converts);
		
		return "view_list_Confirms";
		}
	
	
	@RequestMapping("listAllLead")
	public String listAllInfo(Model model) {
		List<Lead> Leads = leadservice.getAllList();
		model.addAttribute("Leads", Leads);
		
		return "view_list_Lead";
	}
	
	
	@RequestMapping("/leadinfo")
	public String leadInfo(@RequestParam("id") long id,Model model) {
		Lead leads = leadservice.findById(id);
		model.addAttribute("lead", leads);
		return "Lead_Info";
	}
	
}
