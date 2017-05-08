package com.chars.dao;

import java.util.List;

import com.chars.model.Discuss;

public interface IDiscussDao {
	public void insertDiscuss (Discuss discuss);
	public void deleteDiscuss (int id);
	public List<Discuss> getHouseDiscuss (int houseId);
}
