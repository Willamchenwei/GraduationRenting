package com.chars.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chars.model.DetailInformation;
import com.chars.model.House;
import com.chars.model.Manager;
import com.chars.model.User;
import com.chars.service.IDetailInformationService;
import com.chars.service.IHouseService;
import com.chars.service.IManagerService;
import com.chars.service.ISearchService;
import com.chars.service.IUserService;

@Controller
public class ManagerAction {
	@Resource
	private IManagerService managerService;
	@Resource
	private IUserService userService;
	@Resource
	private IHouseService houseService;
	@Resource
	private ISearchService searchService;
	@Resource
	private IDetailInformationService detailInformationService;
	@RequestMapping("managerLogin.do")
	public String managerLogin(String userName, String password, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("userName", userName);
		hashMap.put("password", password);
		Manager manager = managerService.getManager(hashMap);
		if (manager != null) {
			HttpSession session = request.getSession();
			List<House> houseList = houseService.selectHouses();
			List<User> userList = userService.getUsers();
			session.setAttribute("houseList", houseList);
			session.setAttribute("userList", userList);
			return "user_m.jsp";
		}
		model.addAttribute("fail", "用户名或密码错误");
		return "adm.jsp";
	}

	@RequestMapping("removeUser.do")
	public String removeUser(String userId, HttpServletRequest request, HttpServletResponse response, Model model) {
		if (userId != null) {
			int id = Integer.parseInt(userId);
			userService.deleteUser(id);
			HttpSession session = request.getSession();
			List<User> userList = userService.getUsers();
			session.setAttribute("userList", userList);

		} else {
			System.out.println("error, userId is null");

		}
		return "user_m.jsp";

	}

	@RequestMapping("updateHouseState.do")
	public String updateHouseState(String houseId, HttpServletRequest request, HttpServletResponse response,
			String state) {
		System.out.println(Integer.parseInt(houseId));
		House house = new House();
		house.setId(Integer.parseInt(houseId));
		if (state.equals("通过")) 
			house.setState("已发布");
		else if (state.equals("详情")) {
			DetailInformation detailInformation = detailInformationService.getManagerDetailInformation(Integer.parseInt(houseId));
			HttpSession session = request.getSession();
			System.out.println(detailInformation);
			session.setAttribute("managerHouseDetailInformation", detailInformation);
			return "house_inf_m.jsp";
		}
		else
			house.setState("已拒绝");
		if (house != null) {
			houseService.updateHouseState(house);
			HttpSession session = request.getSession();
			List<House> houseList = houseService.selectHouses();
			session.setAttribute("houseList", houseList);
		}
		if (state.equals("发布")) 
			searchService.index();
		return "house_m.jsp";
	}
}
