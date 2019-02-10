package com.bridgelabz.addressbook.model;

public class Address {
	public String city;
	public String state;
	public String zip;
	
	public Address()
	{
		
	}
	public Address(String city,String state,String zip)
	{
	
		this.city=city;
		this.state=state;
		this.zip=zip;
		
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
}

}
