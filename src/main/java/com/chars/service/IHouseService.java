package com.chars.service;

import java.util.List;

import com.chars.model.House;

public interface IHouseService {
	public List<House> selectHouses ();
	public void insertHouse (House house);
	public void updateHouse (House house);
	public List<House> selectHouseByUserId (int id);
	public void deleteHouse (int id);
	public void updateHouseState (House house);
	public House selectHouseById (int id);
	public List<House> selectSearchHouse ();


}
