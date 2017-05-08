package com.chars.model;

import java.io.Serializable;

public class Discuss implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2809011652237012411L;
	private int id;
	private int houseId;
	private int userId;
	private String userName;
	private String discussDate;
	private String discussType;
	private String describle;
	private String housePicture1;
	private String housePicture2;
	private String housePicture3;
	public Discuss () {
		super ();
	}
	public Discuss(int houseId, int userId, String userName, String discussDate, String discussType, String describle, String housePicture1,
			String housePicture2, String housePicture3) {
		super();
		this.houseId = houseId;
		this.userId = userId;
		this.userName = userName;
		this.discussDate = discussDate; 
		this.discussType = discussType;
		this.describle = describle;
		this.housePicture1 = housePicture1;
		this.housePicture2 = housePicture2;
		this.housePicture3 = housePicture3;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDiscussType() {
		return discussType;
	}
	public void setDiscussType(String discussType) {
		this.discussType = discussType;
	}
	public String getDescrible() {
		return describle;
	}
	public void setDescrible(String describle) {
		this.describle = describle;
	}
	public String getHousePicture1() {
		return housePicture1;
	}
	public void setHousePicture1(String housePicture1) {
		this.housePicture1 = housePicture1;
	}
	public String getHousePicture2() {
		return housePicture2;
	}
	public void setHousePicture2(String housePicture2) {
		this.housePicture2 = housePicture2;
	}
	public String getHousePicture3() {
		return housePicture3;
	}
	public void setHousePicture3(String housePicture3) {
		this.housePicture3 = housePicture3;
	}
	
	public String getDiscussDate() {
		return discussDate;
	}
	public void setDiscussDate(String discussDate) {
		this.discussDate = discussDate;
	}
	@Override
	public String toString() {
		return "Discuss [id=" + id + ", houseId=" + houseId + ", userId=" + userId + ", userName=" + userName
				+ ", discussDate=" + discussDate + ", discussType=" + discussType + ", describle=" + describle
				+ ", housePicture1=" + housePicture1 + ", housePicture2=" + housePicture2 + ", housePicture3="
				+ housePicture3 + "]";
	}
	
}
