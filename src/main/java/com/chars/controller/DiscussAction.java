package com.chars.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.remoting.exchange.Request;
import com.chars.model.Discuss;
import com.chars.service.IDiscussService;

@Controller
public class DiscussAction {
	@Resource
	private IDiscussService discussService;
	@RequestMapping ("insertDiscuss.do")
	public String insertDiscuss (Discuss discuss, HttpServletRequest request) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 ");
		Date date = new Date();
		discuss.setDiscussDate(format.format(date));
		discussService.insertDiscuss(discuss);
		HttpSession session = request.getSession();
		List<Discuss> discussList = discussService.getHouseDiscuss(discuss.getHouseId());
		session.setAttribute("discussList", discussList);
		return "order.jsp";
	}
}
