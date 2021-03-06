package com.jersey.country.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.country.dao.ConnectToMongo;
import com.jersey.country.pojo.Countrypojo;
import com.jersey.country.service.CountryCollectionService;

@Path("/country")
public class Countrycontroller {
	CountryCollectionService ccs = new CountryCollectionService();

	// Jaxrs_Assesment/country/getallcountries
	@GET
	@Path("/getallcountries")
	@Produces(MediaType.APPLICATION_JSON)
	public List getAllFriends() {
		List allcountry = ccs.getAllCountry();
		ConnectToMongo cm=new ConnectToMongo(allcountry);
		return allcountry;
	}

	// search by id

	@GET
	@Path("/search/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Countrypojo getFriendById(@PathParam("id") int idToSearch) {
		Countrypojo searchedcountry = ccs.getCountryById(idToSearch);
		return searchedcountry;

	}

	// delete by country id

	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List deleteCountry(@PathParam("id") int idToDelete) {
		System.out.println("country id to be deleted is ==>" + idToDelete);
		Countrypojo remainingcountry = ccs.delCountryById(idToDelete);
		List<Countrypojo> remaininglist = ccs.getAllCountry();
		return remaininglist;

	}

	// update the country

	@POST
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public List updateFriend(Countrypojo c) {

		Countrypojo updatecountry = ccs.updateCountry(c);

		List<Countrypojo> updatedlist = ccs.getAllCountry();
		return updatedlist;
	}
}
