package com.hexaware.fooddelivery.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.fooddelivery.dto.RestaurantsDTO;
import com.hexaware.fooddelivery.entity.Restaurants;
import com.hexaware.fooddelivery.service.IRestaurantsService;


@RestController
@RequestMapping("/restaurant")
public class RestaurantsController {
	@Autowired
	IRestaurantsService service;
	
	
	@PostMapping("/addRestaurants")
	public Restaurants addRestaurants(@RequestBody RestaurantsDTO restaurantsDTO) {
		return service.addRestaurants(restaurantsDTO);
	}

	@GetMapping("/getById/{restaurantId}")
	public RestaurantsDTO getById(@PathVariable int restaurantId) {
		return service.getById(restaurantId);
	}

	@GetMapping("/getAllRestaurants")
	public List<Restaurants> getAllRestaurants() {
		return service.getAllRestaurants();
	}
	
	@PutMapping("/updateRestaurants")
	public Restaurants updateRestaurants(@RequestBody RestaurantsDTO restaurantsDTO) {
		return service.updateRestaurants(restaurantsDTO);
	}

	@DeleteMapping("/deleteById/{restaurantId}")
	public void deleteById(@PathVariable int restaurantId) {
		service.deleteById(restaurantId);
	}

}
