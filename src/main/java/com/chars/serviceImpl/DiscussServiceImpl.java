package com.chars.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chars.dao.IDiscussDao;
import com.chars.model.Discuss;
import com.chars.service.IDiscussService;
@Service
public class DiscussServiceImpl implements IDiscussService{
	@Resource
	private IDiscussDao discussDao;
	public void insertDiscuss(Discuss discuss) {
		discussDao.insertDiscuss(discuss);
	}

	public void deleteDiscuss(int id) {
		discussDao.deleteDiscuss(id);
	}

	public List<Discuss> getHouseDiscuss(int houseId) {
		return discussDao.getHouseDiscuss(houseId);
	}

}
