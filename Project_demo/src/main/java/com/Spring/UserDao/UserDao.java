package com.Spring.UserDao;

import org.springframework.data.jpa.repository.JpaRepository;



import com.Spring.Entity.*;


public interface UserDao extends JpaRepository<User, Integer> {
	

}
