package com.chars.dao;

import java.util.List;

import com.chars.model.Orders;

public interface IOrdersDao {
	public List<Orders> getOrders (int userId);
	public void insertOrders (Orders orders);
	public void deleteOrders (int id);
}
