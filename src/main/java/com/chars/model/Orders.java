package com.chars.model;

import java.io.Serializable;

public class Orders implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1484970585586595053L;
	private int id;
	private int houseId;
	//房东id
	private int houseUserId;
	private int userId;
	private String userName;
	private String state;
	private String unitPrice;
	private String startDate;
	private String stopDate;
	private String ordersDate;
	public Orders () {
		super ();
	}
	public Orders(int houseId, int houseUserId, int userId, String userName, String state, String unitPrice,
			String startDate, String stopDate, String ordersDate) {
		super();
		this.houseId = houseId;
		this.houseUserId = houseUserId;
		this.userId = userId;
		this.userName = userName;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
		return "Orders [id=" + id + ", houseId=" + houseId + ", houseUserId=" + houseUserId + ", userId=" + userId
				+ ", userName=" + userName + ", state=" + state + ", unitPrice=" + unitPrice + ", startDate="
				+ startDate + ", stopDate=" + stopDate + ", ordersDate=" + ordersDate + "]";
	}

	
}

