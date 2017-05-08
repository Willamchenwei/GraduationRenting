package com.chars.model;

import java.io.Serializable;

public class DetailInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4786766405454629496L;
	private int userId;
	private int houseId;
	private String userName;
	private String realName;
	private String picture;
	private String sex;
	private String idCard;
	private String emil;
	private String title;
	private String city;
	private String people;
	private String houseAddress;
	private String houseDescrible;
	private String housePrice;
	private String housePicture1;
	private String housePicture2;
	private String housePicture3;
	private String mobile;
	private String rentstate;
	private String state;
	private String area;
	/*个性描述*/
	private String personality;
	//内部情况
	private String internal;
	
	private String traffic;
	//周边情况
	private String surrounding;
	//配套设施
	private String supportingFacilities;
	private String discussType;
	private String describle;
	private String discussHousePicture1;
	private String discussHousePicture2;
	private String discussHousePicture3;
	public DetailInformation () {
		super ();
	}
	public DetailInformation(int userId, int houseId, String userName, String realName, String picture, String sex,
			String idCard, String emil, String title, String city, String people, String houseAddress,
			String houseDescrible, String housePrice, String housePicture1, String housePicture2, String housePicture3,
			String mobile, String rentstate, String state, String area, String personality, String internal,
			String traffic, String surrounding, String supportingFacilities, String discussType, String describle,
			String discussHousePicture1, String discussHousePicture2, String discussHousePicture3) {
		super();
		this.userId = userId;
		this.houseId = houseId;
		this.userName = userName;
		this.realName = realName;
		this.picture = picture;
		this.sex = sex;
		this.idCard = idCard;
		this.emil = emil;
		this.title = title;
		this.city = city;
		this.people = people;
		this.houseAddress = houseAddress;
		this.houseDescrible = houseDescrible;
		this.housePrice = housePrice;
		this.housePicture1 = housePicture1;
		this.housePicture2 = housePicture2;
		this.housePicture3 = housePicture3;
		this.mobile = mobile;
		this.rentstate = rentstate;
		this.state = state;
		this.area = area;
		this.personality = personality;
		this.internal = internal;
		this.traffic = traffic;
		this.surrounding = surrounding;
		this.supportingFacilities = supportingFacilities;
		this.discussType = discussType;
		this.describle = describle;
		this.discussHousePicture1 = discussHousePicture1;
		this.discussHousePicture2 = discussHousePicture2;
		this.discussHousePicture3 = discussHousePicture3;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
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
	public String getEmil() {
		return emil;
	}
	public void setEmil(String emil) {
		this.emil = emil;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public String getHouseDescrible() {
		return houseDescrible;
	}
	public void setHouseDescrible(String houseDescrible) {
		this.houseDescrible = houseDescrible;
	}
	public String getHousePrice() {
		return housePrice;
	}
	public void setHousePrice(String housePrice) {
		this.housePrice = housePrice;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRentstate() {
		return rentstate;
	}
	public void setRentstate(String rentstate) {
		this.rentstate = rentstate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPersonality() {
		return personality;
	}
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	public String getInternal() {
		return internal;
	}
	public void setInternal(String internal) {
		this.internal = internal;
	}
	public String getTraffic() {
		return traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	public String getSurrounding() {
		return surrounding;
	}
	public void setSurrounding(String surrounding) {
		this.surrounding = surrounding;
	}
	public String getSupportingFacilities() {
		return supportingFacilities;
	}
	public void setSupportingFacilities(String supportingFacilities) {
		this.supportingFacilities = supportingFacilities;
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
	public String getDiscussHousePicture1() {
		return discussHousePicture1;
	}
	public void setDiscussHousePicture1(String discussHousePicture1) {
		this.discussHousePicture1 = discussHousePicture1;
	}
	public String getDiscussHousePicture2() {
		return discussHousePicture2;
	}
	public void setDiscussHousePicture2(String discussHousePicture2) {
		this.discussHousePicture2 = discussHousePicture2;
	}
	public String getDiscussHousePicture3() {
		return discussHousePicture3;
	}
	public void setDiscussHousePicture3(String discussHousePicture3) {
		this.discussHousePicture3 = discussHousePicture3;
	}
	@Override
	public String toString() {
		return "DetailInformation [userId=" + userId + ", houseId=" + houseId + ", userName=" + userName + ", realName="
				+ realName + ", picture=" + picture + ", sex=" + sex + ", idCard=" + idCard + ", emil=" + emil
				+ ", title=" + title + ", city=" + city + ", people=" + people + ", houseAddress=" + houseAddress
				+ ", houseDescrible=" + houseDescrible + ", housePrice=" + housePrice + ", housePicture1="
				+ housePicture1 + ", housePicture2=" + housePicture2 + ", housePicture3=" + housePicture3 + ", mobile="
				+ mobile + ", rentstate=" + rentstate + ", state=" + state + ", area=" + area + ", personality="
				+ personality + ", internal=" + internal + ", traffic=" + traffic + ", surrounding=" + surrounding
				+ ", supportingFacilities=" + supportingFacilities + ", discussType=" + discussType + ", describle="
				+ describle + ", discussHousePicture1=" + discussHousePicture1 + ", discussHousePicture2="
				+ discussHousePicture2 + ", discussHousePicture3=" + discussHousePicture3 + "]";
	}
	
}
