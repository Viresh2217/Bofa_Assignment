package com.Spring.Services;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Entity.*;
import com.Spring.UserDao.*;
import com.Spring.Services.*;
import java.util.ArrayList;


@Service
public class UserServiceImpli implements UserServices {
	
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

	@Override
	public User addUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public void deleteUser(int parseLong) {
		User c=userDao.getById(parseLong);
		userDao.delete(c);
		
	}
	
	
	
	
	

}
