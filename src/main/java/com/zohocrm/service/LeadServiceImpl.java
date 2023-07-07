package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadrepo;
	
	@Override
	public void saveLead(Lead lead) {
		leadrepo.save(lead);
	}

	@Override
	public Lead findById(long id) {
		Optional<Lead> lead = leadrepo.findById(id);
		 Lead lead2 = lead.get();
		 return lead2;
	}

	@Override
	public void deleteById(long id) {
		leadrepo.deleteById(id);
		
	}

	@Override
	public List<Lead> getAllList() {
	List<Lead> lead = leadrepo.findAll();
		return lead;
	}

	
}
