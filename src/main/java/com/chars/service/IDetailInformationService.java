package com.chars.service;

import java.util.List;

import com.chars.model.DetailInformation;

public interface IDetailInformationService {
	public List<DetailInformation> getDetailInformations ();
	public DetailInformation getDetailInformation (int houseId);
	public DetailInformation getManagerDetailInformation (int houseId);

}
