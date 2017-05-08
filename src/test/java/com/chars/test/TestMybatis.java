package com.chars.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chars.dao.IDetailInformationDao;
import com.chars.dao.IDiscussDao;
import com.chars.dao.IHouseDao;
import com.chars.dao.IManagerDao;
import com.chars.dao.IOrdersDao;
import com.chars.dao.IUserDao;
import com.chars.model.DetailInformation;
import com.chars.model.Discuss;
import com.chars.model.House;
import com.chars.model.Manager;
import com.chars.model.Orders;
import com.chars.model.User;
import com.chars.search.Search;
import com.chars.service.ISearchService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestMybatis {
	@Resource
	private IUserDao userDao;
	@Resource
	private IOrdersDao ordersDao;
	@Resource
	private IManagerDao managerDao;
	@Resource
	private IDiscussDao disscussDao;
	@Resource
	private IHouseDao houseDao;
	@Resource
	private ISearchService searchService;
	@Test
	public void t () throws IOException {
		/*HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("phone", "123");
		hashMap.put("password", "1234");
		User user = userDao.getUser(hashMap);
		System.out.println (user);
		
		User user = new User ("chars", "123456", null, "123", "5", "男", "123", "123", null);
		user.setId(1);
		userDao.updateUser(user);
		
		Orders orders = new Orders(1, 1, "已受理", "hj", "hj", "hj", "hj");
		ordersDao.deleteOrders(1);
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("userName", "chenwei");
		hashMap.put("password", "963205");
		Manager manager = managerDao.getManager(hashMap);
		System.out.println(manager);
		Discuss discuss = new Discuss(1, 1, "好评", "kas", "kas", "kas", "kas");
		disscussDao.deleteDiscuss(1);
		House house = new House (1, "sed", "awk", "awk", "awk", "awk", "awk", "awk", "awk","awk", "awk", null, null,"awk", "awk", "awk", "awk", "awk","awk" );
		house.setId(1);
		houseDao.updateHouse(house);
		DetailInformation detail = detailInformationDao.getDetailInformation(1);
		System.out.println(detail);
		List<DetailInformation> list = detailInformationDao.getDetailInformations();*/
	/*	House house = new House (1, "sed", "成都市武侯区33号", "awk", "awk", "awk", "awk", "awk", "awk","awk", "awk", null, null,"awk", "awk", "awk", "awk", "awk","awk" );
		houseDao.insertHouse(house);*/
		
		searchService.index();
		searchService.searchByTerm("houseAddress", "*成都*", 10);
	}
	public static void main (String [] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "spring-mybatis.xml", "dubbo-provider.xml" });  
        context.start();  
        try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
