package com.chars.service;

import java.util.List;

import com.chars.model.Orders;

public interface IOrdersService {
	public List<Orders> getOrders (int userId);
	public void insertOrders (Orders orders);
	public void deleteOrders (int id);
	public void updataOrders (Orders orders);
	public List<Orders> getOrdersbyUserId (int userId);
	public List<Orders> getOrdersbyHouseUserId (int houseUserId);
	public Orders getOrdersbyId (int id);
	public List<Orders> getCleanOrders (String newDate);

}
