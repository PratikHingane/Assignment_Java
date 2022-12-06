package com.nissan.pojo;

import java.time.LocalDate;

public class Asset {

	private String computerName;
	private String brandName;
	private LocalDate manufactureDate;
	private boolean isAvailable;
	private int quantity;
	
	public Asset() {}

	public Asset(String computerName, String brandName,
			LocalDate manufactureDate, boolean isAvailable, int quantity) {
		this.computerName = computerName;
		this.brandName = brandName;
		this.manufactureDate = manufactureDate;
		this.isAvailable = isAvailable;
		this.quantity = quantity;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getComputerName() {
		return computerName;
	}

	public String getBrandName() {
		return brandName;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	@Override
	public String toString() {
		return "Asset [Computer Name: " + computerName + " | Brand Name: "
				+ brandName + " | Manufacture Date: " + manufactureDate
				+ " | Available: " + isAvailable + " | Quantity: " + quantity
				+ "]";
	}
	
}
