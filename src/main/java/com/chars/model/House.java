package com.chars.model;

public class House {
	private int id;
	private int userId;
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
	public House () {
		super ();
	}
	public House(int userId, String title, String city, String people, String houseAddress,
			String houseDescrible, String housePrice, String housePicture1, String housePicture2, String housePicture3,
			String mobile, String rentstate, String state, String area, String personality, String internal,
			String traffic, String surrounding, String supportingFacilities) {
		super();
		this.userId = userId;
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
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	@Override
	public String toString() {
		return "House [id=" + id + ", userId=" + userId + ", title=" + title + ", city=" + city + ", people=" + people
				+ ", houseAddress=" + houseAddress + ", houseDescrible=" + houseDescrible + ", housePrice=" + housePrice
				+ ", housePicture1=" + housePicture1 + ", housePicture2=" + housePicture2 + ", housePicture3="
				+ housePicture3 + ", mobile=" + mobile + ", rentstate=" + rentstate + ", state=" + state + ", area="
				+ area + ", personality=" + personality + ", internal=" + internal + ", traffic=" + traffic
				+ ", surrounding=" + surrounding + ", supportingFacilities=" + supportingFacilities + "]";
	}
	
	
}


