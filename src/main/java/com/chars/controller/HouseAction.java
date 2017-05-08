package com.chars.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
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

import com.chars.dao.IDetailInformationDao;
import com.chars.model.DetailInformation;
import com.chars.model.Discuss;
import com.chars.model.House;
import com.chars.model.User;
import com.chars.service.IDetailInformationService;
import com.chars.service.IDiscussService;
import com.chars.service.IHouseService;
import com.chars.service.ISearchService;

@Controller
public class HouseAction {
	@Resource
	private IDetailInformationService detailInformationService;
	@Resource
	private IHouseService houseService;
	@Resource
	private IDiscussService discussService;
	@Resource
	private ISearchService searchService;
	@RequestMapping ("registHouse.do")
	public String registHouse (House house, Model model, @RequestParam("files") MultipartFile[] files)
			throws IllegalStateException, IOException {
		Random random = new Random();
		List<String> array = new ArrayList<String>();
        if(files!=null&&files.length>0){  
            //循环获取file数组中得文件  
            for(int i = 0; i < files.length; i++){  
                MultipartFile file = files[i];  
                // 文件保存路径  
                String filePath = "C:/Users/admin/workspace/GraduationRenting/src/main/webapp/resource/images/" + file.getOriginalFilename();
                System.out.println(filePath);
                // 转存文件  
                file.transferTo(new File(filePath));  
                array.add ("resource/images/" + file.getOriginalFilename());
            }  
        }
        if (array.size() == 3) {
        	house.setHousePicture1(array.get(0));
        	house.setHousePicture2(array.get(1));
        	house.setHousePicture3(array.get(2));

        }
		house.setState("待审核");
		house.setRentstate("未出租");
		houseService.insertHouse(house);
		model.addAttribute("regisHouse", "success");
		model.addAttribute("success", "发布成功");
		return "release.jsp";
	}

	@RequestMapping ("deleteHouse.do")
	public String deleteHouse (int houseId, Model model){
		houseService.deleteHouse(houseId);
		model.addAttribute("deleteHouse", "success");
		return "";
	}
	@RequestMapping ("loadHouseData.do")
	public String loadHousesData (Model model, HttpServletRequest request) {
		List<DetailInformation> list = detailInformationService.getDetailInformations();
		HttpSession session = request.getSession();
		session.setAttribute("detailInformationList", list);
		System.out.println("aaaa");
		return "index.jsp";
	}
	@RequestMapping ("loadDetailHouseInformation.do")
	public String loadDetailHouseInformation (HttpServletRequest request, String id) {
		int houseId = Integer.parseInt(id);
		DetailInformation detailInformation = detailInformationService.getDetailInformation(houseId);
		HttpSession session = request.getSession();
		session.setAttribute("houseDetailInformation", detailInformation);
		List<Discuss> discussList = discussService.getHouseDiscuss(houseId);
		session.setAttribute("discussList", discussList);
		return "house_information.jsp";
	}
	@RequestMapping ("searchHouse.do")
	public String searchHouse (String address, HttpServletRequest request) throws IOException{
		String houseAddress = "*" + address + "*";
		List<Integer> list = searchService.searchByTerm("houseAddress", houseAddress, 10);
		Iterator<Integer> it = list.iterator();
		List<DetailInformation> searchDetailList = new ArrayList<DetailInformation>();
		while (it.hasNext()) {
			DetailInformation detailInformation = detailInformationService.getDetailInformation((int) it.next());
			System.out.println(detailInformation);
			searchDetailList.add(detailInformation);
		}
		HttpSession session = request.getSession();
		session.setAttribute("searchDetailList", searchDetailList);
		return "goods.jsp";
		
	}
}
