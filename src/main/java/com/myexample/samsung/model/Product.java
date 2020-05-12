package com.myexample.samsung.model;

public class Product {

	private Integer id;
	private String productName;
	private String productConfig;
	private Boolean productAvailable;

	public Product(Integer id, String productName, String productConfig, Boolean productAvailable) {
		super();
		this.id = id;
		this.productName = productName;
		this.productConfig = productConfig;
		this.productAvailable = productAvailable;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductConfig() {
		return productConfig;
	}

	public void setProductConfig(String productConfig) {
		this.productConfig = productConfig;
	}

	public Boolean getProductAvailable() {
		return productAvailable;
	}

	public void setProductAvailable(Boolean productAvailable) {
		this.productAvailable = productAvailable;
	}

	
	
	
}
