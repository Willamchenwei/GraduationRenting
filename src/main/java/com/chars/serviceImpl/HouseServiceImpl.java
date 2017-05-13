package com.chars.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chars.dao.IHouseDao;
import com.chars.model.House;
import com.chars.service.IHouseService;
@Service
public class HouseServiceImpl implements IHouseService{
	@Resource
	private IHouseDao houseDao;
	public List<House> selectHouses() {
		List<House> houseList = houseDao.selectHouses();
		return houseList;
	}

	public void insertHouse(House house) {
		houseDao.insertHouse(house);
	}

	public void updateHouse(House house) {
		houseDao.updateHouse(house);
	}

	public List<House> selectHouseByUserId(int id) {
		// TODO Auto-generated method stub
		return houseDao.selectHouseByUserId(id);
	}

	public void deleteHouse(int id) {
		// TODO Auto-generated method stub
		houseDao.deleteHouse(id);
		
	}

	public void updateHouseState(House house ) {
		houseDao.updateHouseState(house);
	}

	public House selectHouseById(int id) {
		return houseDao.selectHouseById(id);
	}

	public List<House> selectSearchHouse() {
		// TODO Auto-generated method stub
		return houseDao.selectSearchHouse();
	}

}
