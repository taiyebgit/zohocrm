package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.LeadRepositories;
@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepositories leadRepo;
	
	
	@Override
	public void saveOneLead(Lead lead) {
	leadRepo.save(lead);
	}

}
