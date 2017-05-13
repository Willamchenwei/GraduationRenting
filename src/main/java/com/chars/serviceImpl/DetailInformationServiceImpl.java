package com.chars.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.chars.dao.IDetailInformationDao;
import com.chars.model.DetailInformation;
import com.chars.service.IDetailInformationService;
@Service
public class DetailInformationServiceImpl implements IDetailInformationService{
	@Resource
	private IDetailInformationDao detailInformationDao;
	@Cacheable("getDetailInformations")
	public List<DetailInformation> getDetailInformations() {
		List<DetailInformation> detailList = detailInformationDao.getDetailInformations();
		return detailList;
	}

	public DetailInformation getDetailInformation(int houseId) {
		DetailInformation detailInformation = detailInformationDao.getDetailInformation(houseId);
		return detailInformation;
	}

	public DetailInformation getManagerDetailInformation(int houseId) {
		// TODO Auto-generated method stub
		return detailInformationDao.getManagerDetailInformation(houseId);
	}

}
