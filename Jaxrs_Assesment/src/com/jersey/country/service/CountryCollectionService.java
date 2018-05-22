package com.jersey.country.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jersey.country.pojo.Countrypojo;



public class CountryCollectionService {
	
	static HashMap<Integer, Countrypojo> countrymap = new HashMap<Integer, Countrypojo>();

	public CountryCollectionService() {
		super();

		Countrypojo c1 = new Countrypojo(1, "India",10000,"in");
		Countrypojo c4 = new Countrypojo(2, "Bhutan",7000,"bh");
		Countrypojo c2 = new Countrypojo(4, "China",20000,"ch");
		Countrypojo c3 = new Countrypojo(3, "Nepal",8000,"np");
		
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

	public Countrypojo getCountryById(int idToSearch) {
		// TODO Auto-generated method stub
		Countrypojo searchedCountry=countrymap.get(idToSearch);
		return searchedCountry;

		
	}

	public Countrypojo delCountryById(int idToDelete) {
		// TODO Auto-generated method stub
		Countrypojo f= countrymap.remove(idToDelete);		
		return f;
	}

	public Countrypojo updateCountry(Countrypojo c) {
		// TODO Auto-generated method stub
		System.out.println("hai 2");
		System.out.println("before update ==>"+c.getPopulation());

		Countrypojo f= countrymap.put(c.getId(), c);	
		System.out.println("after update ==>"+c.getPopulation());

		return f;
	}

	

}
