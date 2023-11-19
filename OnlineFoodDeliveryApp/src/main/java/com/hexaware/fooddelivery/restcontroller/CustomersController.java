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

import com.hexaware.fooddelivery.dto.CustomersDTO;
import com.hexaware.fooddelivery.entity.Customers;
import com.hexaware.fooddelivery.service.ICustomersService;

@RestController
@RequestMapping("/customers")
public class CustomersController {
	@Autowired
	ICustomersService service;
	
	
	
	@PostMapping("/addCustomers")
	public Customers addCustomers(@RequestBody CustomersDTO customersDTO) {
		return service.addCustomers(customersDTO);
	}

	@GetMapping("/getById/{customerId}")
	public CustomersDTO getById(@PathVariable int customerId) {
		return service.getById(customerId);
	}

	@GetMapping("/getAllCustomers")
	public List<Customers> getAllCustomers() {
		return service.getAllCustomers();
	}

	@PutMapping("/updateCustomers")
	public Customers updateCustomers(@RequestBody CustomersDTO customersDTO) {
		return service.updateCustomers(customersDTO);
	}

	@DeleteMapping("/deleteByCustomers/{customerId}")
	public void deleteById(@PathVariable int customerId) {
		service.deleteById(customerId);
	}

	@GetMapping("/getByCustomer_name/{customerName}")
	public CustomersDTO getByCustomer_name(@PathVariable String customerName) {
		return service.getByCustomerName(customerName);
	}

}
