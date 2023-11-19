package com.hexaware.SpringRestDemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	
	@GetMapping("/getall")
	public String geAlltProducts() {
		
		return "All Product will display";
	}
	
	@PostMapping("/add")
	public String addProduct() {
		return "Product Added";
	}
	
	@PostMapping("/update")
	public String updateProduct() {
		return "Product Updated";
	}
	
	@PostMapping("/delete")
	public String deleteProduct() {
		return "Product Deleted";
	}
	
	
	
}
