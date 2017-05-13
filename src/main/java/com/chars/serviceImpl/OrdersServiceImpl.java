package com.chars.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chars.dao.IOrdersDao;
import com.chars.model.Orders;
import com.chars.service.IOrdersService;
@Service
public class OrdersServiceImpl implements IOrdersService{
	@Resource
	private IOrdersDao ordersDao;
	public List<Orders> getOrders(int userId) {
		List<Orders> ordersList = ordersDao.getOrders(userId);
		return ordersList;
	}

	public void insertOrders(Orders orders) {
		ordersDao.insertOrders(orders);
	}

	public void deleteOrders(int id) {
		ordersDao.deleteOrders(id);
	}

	public void updataOrders(Orders orders) {
		ordersDao.updataOrders(orders);
	}

	public List<Orders> getOrdersbyUserId(int userId) {
		// TODO Auto-generated method stub
		return ordersDao.getOrdersbyUserId(userId);
	}

	public List<Orders> getOrdersbyHouseUserId(int houseUserId) {
		// TODO Auto-generated method stub
		return ordersDao.getOrdersbyHouseUserId(houseUserId);
	}

	public Orders getOrdersbyId(int id) {
		// TODO Auto-generated method stub
		return ordersDao.getOrdersbyId(id);
	}

	public List<Orders> getCleanOrders(String newDate) {
		// TODO Auto-generated method stub
		return ordersDao.getCleanOrders(newDate);
	}

}
