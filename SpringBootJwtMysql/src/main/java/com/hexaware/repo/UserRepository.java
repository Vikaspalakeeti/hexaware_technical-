package com.hexaware.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.user.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

}
