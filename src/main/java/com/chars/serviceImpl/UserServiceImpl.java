package com.chars.serviceImpl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chars.dao.IHouseDao;
import com.chars.dao.IUserDao;
import com.chars.model.House;
import com.chars.model.User;
import com.chars.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;

	public User getUser(HashMap<String, String> hashMap) {
		User user = userDao.getUser(hashMap);
		return user;
	}

	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	public List<User> getUsers() {
		return userDao.getUsers();
	}
	
}
