package com.chars.dao;

import java.util.List;

import com.chars.model.DetailInformation;

public interface IDetailInformationDao {
	public List<DetailInformation> getDetailInformations ();
	public DetailInformation getDetailInformation (int houseId);
	public DetailInformation getManagerDetailInformation (int houseId);
}
