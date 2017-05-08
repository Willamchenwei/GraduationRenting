package com.chars.dao;

import java.util.HashMap;
import java.util.List;

import com.chars.model.User;

public interface IUserDao {
	public User getUser (HashMap<String, String> hashMap);
	public void insertUser (User user);
	public void updateUser (User user);
	public void deleteUser (int id);
	public List<User> getUsers ();
}
