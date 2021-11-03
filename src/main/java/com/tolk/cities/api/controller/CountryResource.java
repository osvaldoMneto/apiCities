package com.tolk.cities.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolk.cities.api.domain.Country;
import com.tolk.cities.api.model.repository.CountryRepository;


@RestController
@RequestMapping("/countries")
public class CountryResource {
	
	
	@Autowired
	CountryRepository countryRepository;
	
	public List<Country>pais(){
	
	
		return countryRepository.findAll();
		
	

	}
}