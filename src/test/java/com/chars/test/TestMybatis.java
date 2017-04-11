package com.chars.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chars.dao.IUserDao;
import com.chars.model.User;

@RunWith(SpringJUnit4ClassRunner.class)		
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
	@Resource
	private IUserDao userDao;
	@Test
	public void t () {
		User user = new User ("chenwei", "1234", "chenwei", "123", "345", "男", "123", "123", "123");
		user.setId(1);
		userDao.updateUser(user, 1);
		
	}
}
