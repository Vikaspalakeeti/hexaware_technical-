package com.hexaware.fooddelivery.service;

import java.util.List;

import com.hexaware.fooddelivery.dto.RestaurantsDTO;
import com.hexaware.fooddelivery.entity.Restaurants;

public interface IRestaurantsService {
	public Restaurants addRestaurants(RestaurantsDTO restaurantDTO);
	public RestaurantsDTO getById(int restaurantId);
	public List<Restaurants> getAllRestaurants();
	Restaurants updateRestaurants(RestaurantsDTO restaurantDTO);
	void deleteById(int restaurantId);

}
