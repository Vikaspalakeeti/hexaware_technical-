package com.hexaware.fooddelivery.dto;

public class CustomersDTO {
	private int customerId;
	private String customerName;
	private String email;
	private String phoneNumber;
	private String deliveryAddress;
	
	public CustomersDTO() {
		super();
	}
	
	
	




	public CustomersDTO(int customerId, String customerName, String email, String phoneNumber, String deliveryAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.deliveryAddress = deliveryAddress;
	}







	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customer_id) {
		this.customerId = customer_id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customer_name) {
		this.customerName = customer_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phone_number) {
		this.phoneNumber = phone_number;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String delivery_address) {
		this.deliveryAddress = delivery_address;
	}
	
	
}
