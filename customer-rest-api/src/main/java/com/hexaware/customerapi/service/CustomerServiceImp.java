package com.hexaware.customerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.customerapi.dto.CustomerDTO;
import com.hexaware.customerapi.entity.Customer;
import com.hexaware.customerapi.repository.CustomerRepository;


@Service
public class CustomerServiceImp implements ICustomerService {
	
	@Autowired
	CustomerRepository customerRepo;
	@Override
	public Customer addCustomer(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		
		
		Customer customer = new Customer();
		customer.setCustomerId(customerDTO.getCustomerId());
		
		customer.setCustomerName(customerDTO.getCustomerName());
		
		customer.setDateOfBirth(customerDTO.getDateOfBirth());
		customer.setProductId(customerDTO.getProductId());
		
		
		return customerRepo.save(customer);
	}

	@Override
	public CustomerDTO getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		
		Customer customer = customerRepo.findById(customerId).orElse(new Customer());
		
		
		
		return new CustomerDTO(customer.getCustomerId(), customer.getCustomerName(),customer.);
		
	}

	@Override
	public List<CustomerDTO> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll()
	}
}
