package com.chars.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chars.dao.IOrdersDao;
import com.chars.model.House;
import com.chars.model.Orders;
import com.chars.service.IHouseService;
import com.chars.service.IOrdersService;

@Controller
public class OrdersAction {
	@Resource
	private IHouseService houseService;
	@Resource
	private IOrdersService ordersService;

	@RequestMapping("insertOrders.do")
	public String insertOrders(Orders orders, String housePrice, HttpServletRequest request) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		orders.setOrdersDate(format.format(date));
		Date d1 = sdf.parse(orders.getStartDate());
		Date d2 = sdf.parse(orders.getStopDate());
		int betweenDay = daysBetween(d1, d2);
		int price = Integer.parseInt(housePrice) * betweenDay;
		orders.setUnitPrice(String.valueOf(price));
		orders.setState("待受理");
		ordersService.insertOrders(orders);
		HttpSession session = request.getSession();
		List<Orders> ordersListByUserId = ordersService.getOrdersbyUserId(orders.getUserId());
		List<Orders> ordersListByHouseUserId = ordersService.getOrdersbyHouseUserId(orders.getHouseUserId());
		session.setAttribute("ordersListByUserId", ordersListByUserId);
		session.setAttribute("ordersListByHouseUserId", ordersListByHouseUserId);
		return "";
	}
	@RequestMapping("updataOrders.do")
	public String updataOrders (Orders orders, String ordersType, HttpServletRequest request) {
		if (ordersType.equals("受理")) 
			orders.setState("已受理");
	
		else
			orders.setState("已拒绝");
		ordersService.updataOrders(orders);
		HttpSession session = request.getSession();
		List<Orders> ordersListByUserId = ordersService.getOrdersbyUserId(orders.getUserId());
		List<Orders> ordersListByHouseUserId = ordersService.getOrdersbyHouseUserId(orders.getHouseUserId());
		session.setAttribute("ordersListByUserId", ordersListByUserId);
		session.setAttribute("ordersListByHouseUserId", ordersListByHouseUserId);
		return "";
	}

	@Test
	public void t() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse("2012-09-08");
		Date d2 = sdf.parse("2012-09-10");
		System.out.println(daysBetween(d1, d2));

	}

	public static int daysBetween(Date smdate, Date bdate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		smdate = sdf.parse(sdf.format(smdate));
		bdate = sdf.parse(sdf.format(bdate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}
}
