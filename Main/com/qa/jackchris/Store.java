package com.qa.jackchris;

public class Store {
	private String storeName;
	private Address storeAddress;
	
	public Store(){}
	public Store(String name, Address address){
		setStoreName(name);
		setStoreAddress(address);
	}
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Address getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(Address storeAddress) {
		this.storeAddress = storeAddress;
	}
}

