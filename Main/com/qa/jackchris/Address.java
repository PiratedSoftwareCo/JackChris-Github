package com.qa.jackchris;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String town;
	private String county;
	private String postalCode;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Address(){}
	public Address(String add1, String add2, String town, String county, String postCode){
		setAddressLine1(add1);
		setAddressLine2(add2);
		setTown(town);
		setCounty(county);
		setPostalCode(postCode);
	}
	
	
}
