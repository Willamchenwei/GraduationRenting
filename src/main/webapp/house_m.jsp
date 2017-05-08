<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="com.chars.model.House"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>房屋管理</title>
	<link rel="stylesheet" type="text/css" href="resource/css/goods.css">
	<link rel="stylesheet" type="text/css" href="resource/css/personal_information.css">
	<link rel="stylesheet" type="text/css" href="resource/css/user_m.css">
	<script src="resource/js/manage.js" type="text/javascript"></script>
</head>
<body>
<%
	List<House> houseList = (List<House>) request.getSession().getAttribute("houseList");
%>
<div>
	<div class="head bg_white">
		<div class="head_logo2">
			<a href="index.jsp" class="logo2"></a>
			<span class="slogan_logo2">四海有家住</span>
			<ul class="rightoflogo2">
				<li>
					传说中的管理员
				</li>
			</ul>
		</div>
	</div>
	<div class="all_con2">
	<div class="slideBar_box">
		<ul>			                                 
			<li id="s_01" class="" onmouseover="mouseOverul1()" onmouseout="mouseOutul1()"><a href="user_m.jsp"><img id="order1" src="resource/images/order1b.png"><span></span>用户管理</a></li>
			<li id="s_02" class="cur" onmouseover="mouseOverul2()"><a href="house_m.jsp"><img id="order2" src="resource/images/order2w.png"><span></span>房屋管理</a></li>					            
		</ul>
	</div>

	<div id="rank">
		<table id="data-ranks">
		<%
			if (houseList != null) {
			Iterator<House> it = houseList.iterator();
			while (it.hasNext()) {
				House house = it.next();
		%>
			<tr>
				<td class="tdname"><span>编号：<%=house.getId() %></span></td>
				<td class="widthright"><span>地址：<%=house.getHouseAddress() %></span></td>
			</tr>
			<tr>
				<td class="tdinf"colspan="2"><span>发布者电话：<%=house.getMobile() %></span>
							<form action="updateHouseState.do" method="post">
								<input style="display:none;" type="text" value="<%=house.getId()%>" name="houseId"
									disable="disable"> 
									<input class="delete_order" type="submit" value="详情" name = "state">
									<input class="delete_order" type="submit" value="通过" name = "state">
									<input class="delete_order" type="submit" value="拒绝" name = "state">
							</form></td>
			</tr>
			<%}} %>
<!-- 			<tr>
				<td class="tdname"><span>编号：XXXXXX</span></td>
				<td class="widthright"><span>地址：xx xxx xxxxx</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2"><span><img src="resource/images/room1.jpg"></span><span>发布者：包租婆</span><span class="delete_order">删除</span></td>
			</tr>
			<tr>
				<td class="tdname"><span>编号：XXXXXX</span></td>
				<td class="widthright"><span>地址：xx xxx xxxxx</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2"><span><img src="resource/images/room1.jpg"></span><span>发布者：包租婆</span><span class="delete_order">删除</span></td>
			</tr>
			<tr>
				<td class="tdname"><span>编号：XXXXXX</span></td>
				<td class="widthright"><span>地址：xx xxx xxxxx</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2"><span><img src="resource/images/room1.jpg"></span><span>发布者：包租婆</span><span class="delete_order">删除</span></td>
			</tr>
			<tr>
				<td class="tdname"><span>编号：XXXXXX</span></td>
				<td class="widthright"><span>地址：xx xxx xxxxx</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2"><span><img src="resource/images/room1.jpg"></span><span>发布者：包租婆</span><span class="delete_order">删除</span></td>
			</tr> -->
		</table>
</div>
	</div>
</div>
	
</body>
</html>	           