package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Lead;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/searchLead")
	public String viewsearchLead() {
		return"create_lead";
	}
	
	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return"lead_info";
	}
	
	
}
