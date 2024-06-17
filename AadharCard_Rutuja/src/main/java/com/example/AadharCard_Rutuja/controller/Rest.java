package com.example.AadharCard_Rutuja.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AadharCard_Rutuja.entity.Adhar;
import com.example.AadharCard_Rutuja.service.Adhar_Service;

@RestController
@RequestMapping("/adhar")
public class Rest {

	private static final Logger logger=LoggerFactory.getLogger(Rest.class);
	@Autowired
	private Adhar_Service service;
	
	@PostMapping("/save")
	public Adhar saveAdhar(@RequestBody Adhar adhar)
	{
		logger.info("Adhar Information Saved...");
		logger.debug("Adhar debug logging is enabled...");
		logger.error("Adhar is saved...");
		logger.warn("Be Ready...");
		logger.trace("start working...");
		return service.saveAdhar(adhar);
	}
	
	@GetMapping("/All")
	public List<Adhar> getAdhar(Adhar adhar)
	{
		return service.getAdhar(adhar);
	}
	
	@GetMapping("/get/{id}")
	public Adhar getAdhar(@PathVariable int id)
	{
		return service.getAdharId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Adhar deleteAadhar(@PathVariable int id)
	{
		return service.deleteAdhar(id); 
	}
	
	@PutMapping("/update/{id}")
	public Adhar updateAadhar(@RequestBody Adhar adhar,@PathVariable int id)
	{
		return service.updateAdhar(adhar,id);
				
	}
}
