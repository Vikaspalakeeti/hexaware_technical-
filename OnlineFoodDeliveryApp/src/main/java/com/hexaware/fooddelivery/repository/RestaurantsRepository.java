package com.hexaware.fooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.fooddelivery.entity.Restaurants;

public interface RestaurantsRepository extends JpaRepository<Restaurants, Integer> {
	

}
