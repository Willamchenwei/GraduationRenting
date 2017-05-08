package com.chars.model;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8076148195975109905L;
	private int id;
	private String userName;
	private String password;
	private String realName;
	private String address;
	private String picture;
	private String sex;
	private String idCard;
	private String phone;
	private String emil;
	
	public User () {
		super(); 
	}
	public User(String userName, String password, String realName, String address, String picture, String sex,
			String idCard, String phone, String emil) {
		super();
		this.userName = userName;
		this.password = password;
		this.realName = realName;
		this.address = address;
		this.picture = picture;
		this.sex = sex;
		this.idCard = idCard;
		this.phone = phone;
		this.emil = emil;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmil() {
		return emil;
	}
	public void setEmil(String emil) {
		this.emil = emil;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", realName=" + realName
				+ ", address=" + address + ", picture=" + picture + ", sex=" + sex + ", idCard=" + idCard + ", phone="
				+ phone + ", emil=" + emil + "]";
	}
	
	
	
}
