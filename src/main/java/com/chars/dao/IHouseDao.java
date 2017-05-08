package com.chars.dao;

import java.util.List;

import com.chars.model.House;

public interface IHouseDao {
	public List<House> selectHouses ();
	public List<House> selectHouse();
	public void insertHouse (House house);
	public void updateHouse (House house);
	public List<House> selectHouseByUserId (int id);
	public void deleteHouse (int id);
	public void updateHouseState (House house);
	public House selectHouseById (int id);

}
