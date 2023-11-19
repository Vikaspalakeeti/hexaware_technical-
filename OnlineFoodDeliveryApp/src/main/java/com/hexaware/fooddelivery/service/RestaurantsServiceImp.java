package com.hexaware.fooddelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.fooddelivery.dto.RestaurantsDTO;
import com.hexaware.fooddelivery.entity.Restaurants;
import com.hexaware.fooddelivery.repository.RestaurantsRepository;



@Service
public class RestaurantsServiceImp implements IRestaurantsService {
	@Autowired
	RestaurantsRepository repo;

	@Override
	public Restaurants addRestaurant(RestaurantsDTO restaurantDTO) {
		// TODO Auto-generated method stub
		Restaurants restaurants = new Restaurants();
		restaurants.setRestaurantId(RestaurantsDTO.getRestaurantId());
		restaurants.setRestaurantName(RestaurantsDTO.getRestaurantName());
		restaurants.setCusineType(RestaurantsDTO.getCuisineType());
		restaurants.setLocation(RestaurantsDTO.getLocation());
		restaurants.setRating(RestaurantsDTO.getRating());
		return repo.save(restaurants);
	}


	@Override
	public RestaurantsDTO getById(int restaurantId) {
		// TODO Auto-generated method stub
		Restaurants restaurants = repo.findById(restaurantId).orElse(null);
		RestaurantsDTO restaurantsDTO = new RestaurantsDTO();
		restaurantsDTO.setRestaurantId(restaurants.getRestaurantId());
		restaurantsDTO.setRestaurantName(restaurants.getRestaurantName());
		restaurantsDTO.setCuisineType(restaurants.getCuisineType());
		restaurantsDTO.setLocation(restaurants.getLocation());
		restaurantsDTO.setRating(restaurants.getRating());
		return restaurantsDTO; 
	}

	@Override
	public List<Restaurants> getAllRestaurants() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public Restaurants updateRestaurants(RestaurantsDTO restaurantDTO) {
		// TODO Auto-generated method stub
		Restaurants restaurants = new Restaurants();
		restaurants.setRestaurantId(restaurantsDTO.getRestaurantId());
		restaurants.setRestaurantName(restaurantsDTO.getRestaurantName());
		restaurants.setCuisineType(restaurantsDTO.getCuisineType());
		restaurants.setLocation(restaurantsDTO.getLocation());
		restaurants.setRating(restaurantsDTO.getRating());
		
		
		
		return repo.save(restaurants);
	}
	@Override
	public void deleteById(int restaurantId) {
		// TODO Auto-generated method stub
		Restaurants restaurants =repo.findById(restaurantId).orElse(null);
		repo.deleteById(restaurants.getRestaurantId());

	}

}
