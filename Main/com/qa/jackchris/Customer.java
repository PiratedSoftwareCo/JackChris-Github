package com.qa.jackchris;

public class Customer {
	private String name;
	private Address customerAddress;
	
	public Customer(){}
	public Customer(String name){
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
}
