<!DOCTYPE html>
<%@page import="com.chars.model.DetailInformation"%>
<%@page import="com.chars.model.House"%>
<%@page import="java.util.List"%>
<%@page import="com.chars.model.User"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resource/css/index.css" />

<script src="resource/js/index.js" type="text/javascript"></script>

<title>大头短租网</title>
</head>
<body>
	<%
		User user = (User) request.getSession().getAttribute("user");
		String result = (String) request.getSession().getAttribute("fail");
		request.getSession().removeAttribute("fail");
		List<DetailInformation> houseList = (List<DetailInformation>) request.getSession().getAttribute("detailInformationList");
	%>
	<script type="text/javascript">
		var int = self.setInterval("aheadclick()", 3000);
	</script>
	<div>

		<div class="head">
			<div class="head_logo">
				<a href="index.jsp" class="logo"></a> <span class="slogan_logo"></span>
				<%
					if (user != null) {
				%>
				<ul class="rightoflogo" style="display: none;">
					<%
						} else {
					%>
					<ul class="rightoflogo" style="display:;">
						<%
							}
						%>
						<li><a href="javascript:openLogin(); sclick()">注册</a></li>
						<li>·</li>
						<li><a href="javascript:openLogin(); lclick()">登录</a></li>
						<li>·</li>
						<li><a href="" onmouseover="mouseOver()"
							onmouseout="mouseOut()">短租指南 <img id="pull"
								src="resource/images/pull_down.png">
						</a>
							<div class="rentlist width_set" onmouseover="mouseOver()"
								onmouseout="mouseOut()">
								<div class="rentlist_in">
									<span> <a href="" class="cus">房客指南</a> <a href=""
										class="mas">房东指南</a>
									</span>
								</div>
							</div></li>
						<li><a href="release.jsp" class="freeroom">免费发布房间</a></li>
					</ul>
					<%
						if (user == null) {
					%>
					<ul class="rightoflogo" style="display: none;">
						<%
							} else {
						%>
						<ul class="rightoflogo" style="display:;">
							<li><a href="" onmouseover="mouseOver()"
								onmouseout="mouseOut()"><%=user.getUserName()%> <img
									id="pull" <%if (user.getPicture() != null) { %>src=<%=user.getPicture()%> <%} else { %>src="resource/images/headimg.jpg" <%} %>> </a> <%
 	}
 %>


								<div class="rentlist width_set" onmouseover="mouseOver()"
									onmouseout="mouseOut()">
									<div class="rentlist_in">
										<span> <a href="personal_information.jsp"
											class="cus white">个人中心</a> <a href="order.jsp"
											class="mas white">我的订单</a> <a>
												<form name="signform" action="loginout.do" method="post">
														<button type="submit" class="bt_cancel" style="background:#fff">退出登录</button>
												</form>
										</a>
										</span>
									</div>
								</div></li>
							<li>·</li>
							<li><a href="order.jsp">我的订单</a></li>
							<li>·</li>
							<li><a href="" onmouseover="mouseOver()"
								onmouseout="mouseOut()">短租指南 <img id="pull"
									src="resource/images/pull_down.png">
							</a>
								<div class="rentlist width_set" onmouseover="mouseOver()"
									onmouseout="mouseOut()">
									<div class="rentlist_in">
										<span> <a href="" class="cus">房客指南</a> <a href=""
											class="mas">房东指南</a>
										</span>
									</div>
								</div></li>
							<li><a href="release.jsp" class="freeroom">免费发布房间</a></li>
						</ul>
			</div>

		</div>
		<div class="banner_con">
			<div class="banner">
				<ul class="banner_ul">
					<li id="roll1" style="display:;"><a
						href="house_information.html"><input type="image" src="resource/images/room1.jpg" class="li_img">
					</a></li>
					<li id="roll2" style="display: none;"><a href=""><input type="image" src="resource/images/room2.jpg" class="li_img">
					</a></li>
					<li id="roll3" style="display: none;"><a href=""><input type="image" src="resource/images/room3.jpg" class="li_img">
					</a></li>
					<li id="roll4" style="display: none;"><a href=""><input type="image" src="resource/images/room4.jpg" class="li_img">
					</a></li>
				</ul>
				<div class="ahead_back">
					<div class="ahead" onclick="aheadclick()"></div>
					<div class="back" onclick="backclick()"></div>
				</div>
				<div class="search">
					<div class="search_nation">
						<span class="inland"></span> <span id="inl" class="nation_name"
							onclick="inclick()">国内</span> <span class="oversea"></span> <span
							id="ove" class="nation_name" onclick="overclick()">海外</span>
					</div>
					<div class="select_city">
						<span class="icon_place" id="suggest_icon"></span>
						<form name="search" action="searchHouse.do" method="post">
						 <input
							class="ipt_search_l r_border" type="text" id="address"
							name="address" autocomplete="off" value="">
					</div>
					<input class="btn_pink_search" type="submit" value="搜索">
				</div>
				</form>
				<span class="previous"></span> <span class="next"></span> <span
					class="bgup"></span> <span class="bgdown"></span>
			</div>
		</div>
		<div class="index_T"></div>
		<%if (houseList != null) {
			if (houseList.size() >= 6) {
		%>
		<div class="goods_con">
			<div class="goods_inf">
				<div class="img_con">
					<a href=""><img src=<%=houseList.get(1).getHousePicture1() %>></a>
				</div>
				<div class="rooms_intro">
					<img class="img_user_fd" lazy_src="finish"
						src=<%=houseList.get(1).getPicture() %>> <span class="room_name"><%=houseList.get(1).getTitle() %>
						- <%=houseList.get(1).getCity() %></span> <span class="index_price"><em class="bigFont">¥</em><%=houseList.get(1).getHousePrice() %></span>
				</div>
			<form name="sign" action="loadDetailHouseInformation.do" method="post"
				enctype="multipart/form-data">
			
				<input type="text" style="display: none" name="id"
					value="<%=houseList.get(1).getHouseId() %>">
				<input class="bg_black" type="submit">
				</form>
			</div>
			
			
			<div class="goods_inf">
				<div class="img_con">
					<a href=""><img src=<%=houseList.get(0).getHousePicture1() %>></a>
				</div>
				<div class="rooms_intro">
					<img class="img_user_fd" lazy_src="finish"
						src=<%=houseList.get(0).getPicture() %>> <span class="room_name"><%=houseList.get(0).getTitle() %>
						- <%=houseList.get(0).getCity() %></span> <span class="index_price"><em class="bigFont">¥</em><%=houseList.get(0).getHousePrice() %></span>
				</div>
				<form name="sign" action="loadDetailHouseInformation.do" method="post"
				enctype="multipart/form-data">
			
				<input type="text" style="display: none" name="id"
					value="<%=houseList.get(0).getHouseId()%>">
				<input class="bg_black" type="submit">
				</form>
			</div>
				<div class="goods_inf">
				<div class="img_con">
					<a href=""><img src=<%=houseList.get(2).getHousePicture1() %>></a>
				</div>
				<div class="rooms_intro">
					<img class="img_user_fd" lazy_src="finish"
						src=<%=houseList.get(2).getPicture() %>> <span class="room_name"><%=houseList.get(2).getTitle() %>
						- <%=houseList.get(2).getCity() %></span> <span class="index_price"><em class="bigFont">¥</em><%=houseList.get(2).getHousePrice() %></span>
				</div>
				<form name="sign" action="loadDetailHouseInformation.do" method="post"
				enctype="multipart/form-data">
			
				<input type="text" style="display: none" name="id"
					value="<%=houseList.get(2).getHouseId()%>">
				<input class="bg_black" type="submit">
				</form>
			</div>
				<div class="goods_inf">
				<div class="img_con">
					<a href=""><img src=<%=houseList.get(3).getHousePicture1() %>></a>
				</div>
				<div class="rooms_intro">
					<img class="img_user_fd" lazy_src="finish"
						src=<%=houseList.get(3).getPicture() %>> <span class="room_name"><%=houseList.get(3).getTitle() %>
						- <%=houseList.get(3).getCity() %></span> <span class="index_price"><em class="bigFont">¥</em><%=houseList.get(3).getHousePrice() %></span>
				</div>
				<form name="sign" action="loadDetailHouseInformation.do" method="post"
				enctype="multipart/form-data">
			
				<input type="text" style="display: none" name="id"
					value="<%=houseList.get(3).getHouseId()%>">
				<input class="bg_black" type="submit">
				</form>
			</div>
				<div class="goods_inf">
				<div class="img_con">
					<a href=""><img src=<%=houseList.get(4).getHousePicture1() %>></a>
				</div>
				<div class="rooms_intro">
					<img class="img_user_fd" lazy_src="finish"
						src=<%=houseList.get(4).getPicture() %>> <span class="room_name"><%=houseList.get(4).getTitle() %>
						- <%=houseList.get(4).getCity() %></span> <span class="index_price"><em class="bigFont">¥</em><%=houseList.get(4).getHousePrice() %></span>
				</div>
				<form name="sign" action="loadDetailHouseInformation.do" method="post"
				enctype="multipart/form-data">
			
				<input type="text" style="display: none" name="id"
					value="<%=houseList.get(4).getHouseId()%>">
				<input class="bg_black" type="submit">
				</form>
			</div>
				<div class="goods_inf">
				<div class="img_con">
					<a href=""><img src=<%=houseList.get(5).getHousePicture1() %>></a>
				</div>
				<div class="rooms_intro">
					<img class="img_user_fd" lazy_src="finish"
						src=<%=houseList.get(5).getPicture() %>> <span class="room_name"><%=houseList.get(5).getTitle() %>
						- <%=houseList.get(5).getCity() %></span> <span class="index_price"><em class="bigFont">¥</em><%=houseList.get(5).getHousePrice() %></span>
				</div>
				<form name="sign" action="loadDetailHouseInformation.do" method="post"
				enctype="multipart/form-data">
			
				<input type="text" style="display: none" name="id"
					value="<%=houseList.get(5).getHouseId()%>">
				<input class="bg_black" type="submit">
				</form>
			</div>
		</div>
		<%} }%>
		<div class="index_T2"></div>
	</div>


	<%
		if (result != null && user == null) {
	%>
	<div id="back" style="display:;"></div>
	<div id="win" style="display:;">
		<%
			} else {
		%>
		<div id="back" style="display: none;"></div>
		<div id="win" style="display: none;">
			<%
				}
			%>
			<div class="r_colsed" id="closeUserLoginDialog"
				onclick="closeLogin()"></div>
			<div class="information">
				<ul class="select_lors">
					<li class="lands underL1" id="login_on" onclick="lclick()">登录</li>
					<li class="lands" id="sign_in" onclick="sclick()">注册</li>
				</ul>
				<%
					if (result != null && user == null) {
				%>
				<div class="form_contain_l" id="l_id" style="display:">
					<%
						} else {
					%>
					<div class="form_contain_l" id="l_id" style="display: none">
						<%
							}
						%>
						<form name="loginform" action="login.do" method="post">
							<div class="user_name" align="center">
								<input class="name_text" type="text" name="userName"
									placeholder="用户名" />
							</div>
							<div class="password" align="center">
								<input class="password_text" type="password" name="password"
									placeholder="密码" />
							</div>
							<div class="login">
								<button class='login_button' type="submit">登录</button>
							</div>
							<%
								if (result != null && result.equals("error")) {
							%>
							<center class="logo_wrong" style="display:;">
								<span>用户名或密码错误！</span>
							</center>
							<%
								} else {
							%>
							<center class="logo_wrong" style="display: none;">
								<span>用户名或密码错误！</span>
							</center>
							<%
								}
							%>
						</form>
					</div>
					<div class="form_contain_s" id="s_id" style="display: none">
						<form name="signform" onsubmit="return check()"
							action="register.do" method="post">
							<div class="user_name_s" align="center">
								<input onblur="checknick()" onfocus="focus_nick()" id="nickn"
									style="background-image: url(resource/images/adm.png);"
									class="name_text_s" type="text" name="userName"
									placeholder="用户名" />
							</div>
							<div class="user_email" align="center">
								<input onblur="checkem()" onfocus="focus_email()" id="emil"
									style="background-image: url(resource/images/email.png);"
									class="email_text" type="text" name="emil" placeholder="邮箱" />
							</div>
							<div class="password_s" align="center">
								<input onblur="checkpass1()" onfocus="focus_pass1()" id="pass1"
									style="background-image: url(resource/images/pas.png);"
									class="password_text_s" type="password" name="password"
									placeholder="设置密码" />
							</div>
							<div class="password_s2" align="center">
								<input onblur="checkpass2()" onfocus="focus_pass2()" id="pass2"
									style="background-image: url(resource/images/pas2.png);"
									class="password_text_s2" type="password" placeholder="重复密码" />
							</div>
							<div class="sign">
								<button class='login_button' type="submit">注册</button>
							</div>
						</form>
					</div>
				</div>

			</div>
</body>
</html>