package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zohocrm.Dto.LeadDto;
import com.zohocrm.entities.Lead;
import com.zohocrm.repository.LeadRepository;




@RestController
@RequestMapping("/api/lead")
public class LeadRestController{
	
	
	@Autowired
	private LeadRepository leadrepo;
	
	//http://localhost:8080/ZohoCRMApp/api/lead
	
	
	// this is the READ operation------------------------------------------------------------------------
	
	
	@GetMapping
	public List<Lead> viewAllleads(){
		List<Lead> lead = leadrepo.findAll();
		return lead;
	}
	
	
	// this is  the CREATE or SAVE operation---------------------------------------------------------------
	
	
	@PostMapping
	public void savelead(@RequestBody Lead lead) {
		leadrepo.save(lead);
	}
	
	// this is the DELETE operation-------------------------------------------------------------------------
	
	
	//http://localhost:8080/ZohoCRMApp/api/lead/1
	
	@DeleteMapping("{id}")
	public void deleteLead(@PathVariable("id") long id) {
		leadrepo.deleteById(id);
	}
	
	
	
	// this is UPDATING the lead by performing the operation
	
	
	//http://localhost:8080/ZohoCRMApp/api/lead/1
	
	@PutMapping("{id}")
	public void updateLead(@RequestBody LeadDto dto ,@PathVariable("id") long id) {
		Lead l = new Lead();
		l.setId(id);
		l.setFirstName(dto.getFirstName());
		l.setLastName(dto.getLastName());
		l.setEmailId(dto.getEmailId());
		l.setMobileNo(dto.getMobileNo());
		l.setSource(dto.getSource());
		
		leadrepo.save(l);
	}
	
	
	
	
	
	
	
	
}