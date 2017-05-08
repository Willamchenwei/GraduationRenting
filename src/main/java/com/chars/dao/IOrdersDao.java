package com.chars.dao;

import java.util.List;

import com.chars.model.Orders;

public interface IOrdersDao {
	public List<Orders> getOrders (int userId);
	public void insertOrders (Orders orders);
	public void deleteOrders (int id);
	public void updataOrders (Orders orders);
	public List<Orders> getOrdersbyUserId (int userId);
	public List<Orders> getOrdersbyHouseUserId (int houseUserId);
}
