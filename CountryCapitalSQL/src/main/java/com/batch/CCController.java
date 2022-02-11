package com.batch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cap")
public class CCController {
	
	@Autowired
	CCService ccService;
	
	@GetMapping
	public String welcome() {
		return "Hi There, Enter a country next to the request to get its capital";
	}
	
	@GetMapping("/{Country}/capital")
	public String getCapital(@PathVariable String Country) {
		String countryCapital = ccService.getCountryDetails(Country);
		return countryCapital;
	}

	public List<Countrycapital> getCountries(){
		return ccService.getCountries();
		}
}
