package com.jersey.country.pojo;

public class Countrypojo {
int id;
String countryname;
long population;
String countrycode;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCountryname() {
	return countryname;
}
public void setCountryname(String countryname) {
	this.countryname = countryname;
}
public long getPopulation() {
	return population;
}
public void setPopulation(long population) {
	this.population = population;
}
public String getCountrycode() {
	return countrycode;
}
public void setCountrycode(String countrycode) {
	this.countrycode = countrycode;
}
public Countrypojo(int id, String countryname, long population,
		String countrycode) {
	super();
	this.id = id;
	this.countryname = countryname;
	this.population = population;
	this.countrycode = countrycode;
}
public Countrypojo() {
	super();
	// TODO Auto-generated constructor stub
}



}
