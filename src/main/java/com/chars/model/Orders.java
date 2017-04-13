package com.chars.model;

public class Orders {
	private int id;
	private int houseId;
	private int userId;
	private String state;
	private String unitPrice;
	private String startDate;
	private String stopDate;
	private String ordersDate;
	public Orders () {
		super ();
	}
	public Orders(int houseId, int userId, String state, String unitPrice, String startDate, String stopDate,
			String ordersDate) {
		super();
		this.houseId = houseId;
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
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
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
		return "Orders [id=" + id + ", houseId=" + houseId + ", userId=" + userId + ", state=" + state + ", unitPrice="
				+ unitPrice + ", startDate=" + startDate + ", stopDate=" + stopDate + ", ordersDate=" + ordersDate
				+ "]";
	}
	
}

