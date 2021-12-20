package com.Spring.Services;

import java.util.List;


import com.Spring.Entity.*;

public interface UserServices {
	
	public List<User> getUsers();

	public User getUser(int id);

   public User addUser(User user);
	
	public User updateUser(User user);
	
	void deleteUser(int parseLong);
	
	
}
