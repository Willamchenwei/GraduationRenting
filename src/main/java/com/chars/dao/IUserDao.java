package com.chars.dao;

import com.chars.model.User;

public interface IUserDao {
	public User getUser (int id);
	public void insertUser (User user);
	public void updateUser (User user, int id);
	public void deleteUser (int id);
}
