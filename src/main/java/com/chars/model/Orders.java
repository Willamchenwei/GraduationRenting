package com.chars.model;

import java.io.Serializable;

public class Orders implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1484970585586595053L;
	private int id;
	//房东id
	private int houseUserId;
	private int userId;
	private String state;
	private String unitPrice;
	private String startDate;
	private String stopDate;
	private String ordersDate;
	public Orders () {
		super ();
	}
	public Orders(int houseUserId, int userId, String state, String unitPrice, String startDate, String stopDate,
			String ordersDate) {
		super();
		this.houseUserId = houseUserId;
		this.userId = userId;
		this.state = state;
		this.unitPrice = unitPrice;
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.ordersDate = ordersDate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHouseUserId() {
		return houseUserId;
	}
	public void setHouseUserId(int houseUserId) {
		this.houseUserId = houseUserId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStopDate() {
		return stopDate;
	}
	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}
	public String getOrdersDate() {
		return ordersDate;
	}
	public void setOrdersDate(String ordersDate) {
		this.ordersDate = ordersDate;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", houseUserId=" + houseUserId + ", userId=" + userId + ", state=" + state + ", unitPrice="
				+ unitPrice + ", startDate=" + startDate + ", stopDate=" + stopDate + ", ordersDate=" + ordersDate
				+ "]";
	}
	
}

