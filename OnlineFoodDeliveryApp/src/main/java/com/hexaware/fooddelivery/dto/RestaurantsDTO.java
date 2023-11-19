package com.hexaware.fooddelivery.dto;



public class RestaurantsDTO {

	private int restaurantId ;
	private String restaurantName ;
    private String cuisineType;
    private String location;
    private double rating;
	public RestaurantsDTO() {
		super();
	}
	public RestaurantsDTO(int restaurantId, String restaurantName, String cuisineType, String location, double rating) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.cuisineType = cuisineType;
		this.location = location;
		this.rating = rating;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCuisineType() {
		return cuisineType;
	}
	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
    

}
