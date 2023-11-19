package com.hexaware.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.repo.UserRepository;
import com.hexaware.service.IUserService;
import com.hexaware.user.User;


@Service
public class UserServiceImp implements IUserService {
	
	@Autowired
	private UserRepository repo; // Has - a
	
	@Override 
	public Integer saveUser(User user) 
	{
		// TO DO : Encode password
		return repo.save(user).getId();
		
		
	}

}
