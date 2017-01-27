package com.qa.jackchris;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String town;
	private String county;
	private String postalCode;
	
	public Address(){}
	public Address(String add1, String add2, String town, String county, String postCode){
		addressLine1 = add1;
		addressLine2 = add2;
		this.town = town;
		this.county = county;
		this.postalCode = postCode;
	}
	
	
	
}
