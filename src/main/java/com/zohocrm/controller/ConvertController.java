package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Convert;
import com.zohocrm.service.ConvertService;

@Controller
public class ConvertController {
	
	@Autowired
	private ConvertService convertservice;
	
	/*
	//Constructor dependency injection----------------------------------------------------
	private ConvertService convertservice;
	
	
	public ConvertController(ConvertService convertservice) {
		super();
		this.convertservice = convertservice;
	}
	-------------------------------------------------------------------------------------------
	*/

	@RequestMapping("listAllConfirms")
	public String listAllInfo(Model model) {
		List<Convert> converts = convertservice.getAllList();
		model.addAttribute("converts", converts);
		
		return "view_list_Confirms";
	}
	
	
	@RequestMapping("generateBill")
	public String viewBillingConfirms(@RequestParam("id") long id,Model model) {
		Convert convert = convertservice.getConvertById(id);
		model.addAttribute("convert", convert);
		return "Generate_Page";
	}
}
