package com.chars.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.chars.model.House;
import com.chars.model.Orders;
import com.chars.model.User;
import com.chars.service.IHouseService;
import com.chars.service.IOrdersService;
import com.chars.service.IUserService;

import java.util.Iterator;

@Controller
public class UserAction {
	@Resource
	private IUserService userService;
	@Resource
	private IHouseService houseService;
	@Resource
	private IOrdersService ordersService;

	@RequestMapping("login.do")
	public String login(String userName, String password, String phone, String emil, Model model,
			HttpServletRequest request, HttpServletResponse response) {
		System.out.println("userName: " + userName + "password:" + password);
		HashMap<String, String> hashMap = new HashMap<String, String>();
		if (userName != null)
			hashMap.put("userName", userName);
		if (phone != null)
			hashMap.put("phone", phone);
		if (emil != null)
			hashMap.put("emil", emil);
		hashMap.put("password", password);
		User user = userService.getUser(hashMap);
		HttpSession session = request.getSession();
		if (user != null) {
			List<House> houseList = houseService.selectHouses();
			List<House> myHouseList = houseService.selectHouseByUserId(user.getId());
			List<Orders> ordersListByUserId = ordersService.getOrdersbyUserId(user.getId());
			List<Orders> ordersListByHouseUserId = ordersService.getOrdersbyHouseUserId(user.getId());
			session.setAttribute("ordersListByUserId", ordersListByUserId);
			session.setAttribute("ordersListByHouseUserId", ordersListByHouseUserId);
			session.setAttribute("user", user);
			session.setAttribute("houseList", houseList);
			session.setAttribute("myHouseList", myHouseList);
			return "index.jsp";
		} else {
			session.setAttribute("fail", "error");
			return "index.jsp";
		}
	}

	@RequestMapping("userDetail.do")
	public String userDetail(User user, Model model, @RequestParam("files") MultipartFile[] files, HttpServletRequest request)
			throws IllegalStateException, IOException {
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request))
        {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
           //获取multiRequest 中所有的文件名
            Iterator iter=multiRequest.getFileNames();
             
            while(iter.hasNext())
            {
                //一次遍历所有文件
                MultipartFile file=multiRequest.getFile(iter.next().toString());
                if(file!=null)
                {
                    String path="C:/Users/admin/workspace/GraduationRenting/src/main/webapp/resource/images/"+file.getOriginalFilename();
                    //上传
                    file.transferTo(new File(path));
                    user.setPicture ("resource/images/" + file.getOriginalFilename());

                }
                 
            }
           
        }
   /*     if(files!=null&&files.length>0){  
            //循环获取file数组中得文件  
            for(int i = 0; i < files.length; i++){  
                MultipartFile file = files[i];  
                // 文件保存路径  
                String filePath = "C:/Users/admin/workspace/GraduationRenting/src/main/webapp/resource/images/" + file.getOriginalFilename();
                System.out.println(filePath);
                // 转存文件  
                file.transferTo(new File(filePath));  
                user.setPicture ("resource/images/" + file.getOriginalFilename());
            }  
        }
		System.out.println(user);*/

		userService.updateUser(user);
		System.out.println(user);
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		return "personal_information.jsp";
	}

	@RequestMapping("register.do")
	public String register(User user) {
		List<User> list = userService.getUsers();
		Iterator<User> it = list.iterator();
		while (it.hasNext()) {
			User u = it.next();
			if (u.getUserName().equals(user.getUserName()))
				return "index.jsp";
		}
		
		if (user != null)
			userService.insertUser(user);
		return "index.jsp";
	}

	@RequestMapping("loginout.do")
	public String loginout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		if (session == null)
			return "index.jsp";
		session.removeAttribute("user");
		session.removeAttribute("ordersListByUserId");
		session.removeAttribute("ordersListByHouseUserId");
		session.removeAttribute("houseList");
		session.removeAttribute("myHouseList");
		return "index.jsp";
	}

}
