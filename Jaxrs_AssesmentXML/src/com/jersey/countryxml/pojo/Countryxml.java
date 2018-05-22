package com.jersey.countryxml.pojo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "country")
@XmlAccessorType(XmlAccessType.FIELD)
public class Countryxml {
	int id;
	String countryname;
	long population;
	String countrycode;
	

	public Countryxml() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Countryxml(int id, String countryname, long population,
			String countrycode) {
		super();
		this.id = id;
		this.countryname = countryname;
		this.population = population;
		this.countrycode = countrycode;
	}
	@XmlElement
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	@XmlElement
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	@XmlElement
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	
}
