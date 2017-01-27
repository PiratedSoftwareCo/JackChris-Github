package com.qa.jackchris;

public class OrderLine {
	private String productID;
	private String productName;
	private int productAmount;
	
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
