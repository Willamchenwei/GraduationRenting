package com.chars.serviceImpl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chars.dao.IManagerDao;
import com.chars.model.Manager;
import com.chars.service.IManagerService;
@Service
public class ManagerServiceImpl implements IManagerService{
	@Resource
	private IManagerDao managerDao;
	public Manager getManager(HashMap<String, String> hashMap) {
		Manager manager = managerDao.getManager(hashMap);
		return manager;
	}

}
