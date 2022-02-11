package com.batch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CCService {

	@Autowired
	CCRepository ccRepository;
	
	public String getCountryDetails(String Country) {
		
		List<Countrycapital> countryCap = ccRepository.findAll();
		String countrycapital = "Not Found";
		for(Countrycapital country:countryCap) {
			if(Country.equals(country.getCountry())) {
			countrycapital = country.getCountry()+":"+country.getCapital();
			System.out.println(countrycapital);
		}}
		return countrycapital ;
	}
	
	public List<Countrycapital> getCountries(){
		return ccRepository.getAllCountriesAndCapitals();
		}
	
}
