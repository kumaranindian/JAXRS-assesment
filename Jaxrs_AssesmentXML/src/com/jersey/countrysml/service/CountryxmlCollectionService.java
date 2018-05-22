package com.jersey.countrysml.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.jersey.countryxml.pojo.Countryxml;



public class CountryxmlCollectionService {
	
	static HashMap<Integer, Countryxml> countrymap = new HashMap<Integer, Countryxml>();

	public CountryxmlCollectionService() {
		super();

		Countryxml c1 = new Countryxml(1, "India",10000,"in");
		Countryxml c4 = new Countryxml(2, "Bhutan",7000,"bh");
		Countryxml c2 = new Countryxml(4, "China",20000,"ch");
		Countryxml c3 = new Countryxml(3, "Nepal",8000,"np");
		
		countrymap.put(1, c1);
		countrymap.put(2, c4);
		countrymap.put(3, c3);
		countrymap.put(3, c2);

	}
	
	public List getAllCountry() {
		// TODO Auto-generated method stub
		List countries = new ArrayList(countrymap.values());
		return countries;
	}

	public Countryxml getCountryById(int idToSearch) {
		// TODO Auto-generated method stub
		Countryxml searchedCountry=countrymap.get(idToSearch);
		return searchedCountry;

		
	}

	public Countryxml delCountryById(int idToDelete) {
		// TODO Auto-generated method stub
		Countryxml f= countrymap.remove(idToDelete);		
		return f;
	}

	public Countryxml updateCountry(Countryxml c) {
		// TODO Auto-generated method stub
		System.out.println("hai 2");
		System.out.println("before update ==>"+c.getPopulation());

		Countryxml f= countrymap.put(c.getId(), c);	
		System.out.println("after update ==>"+c.getPopulation());

		return f;
	}
}
