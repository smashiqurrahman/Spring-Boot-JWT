package com.ashiq.springbootjwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ashiq.springbootjwt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);

}
