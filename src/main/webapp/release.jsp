<!DOCTYPE html>
<%@page import="com.chars.model.User"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>免费发布房屋</title>
<link rel="stylesheet" type="text/css" href="resource/css/goods.css">
<link rel="stylesheet" type="text/css"
	href="resource/css/personal_information.css">
<link rel="stylesheet" type="text/css" href="resource/css/order.css">
<link rel="stylesheet" type="text/css" href="resource/css/release.css">
<script src="resource/js/release.js" type="text/javascript"></script>
</head>
<body>
	<%
		User user = (User) request.getSession().getAttribute("user");
	%>
	<div>
		<div class="head bg_white">
			<div class="head_logo2">
				<a href="index.jsp" class="logo2"></a> <span class="slogan_logo2">四海有家住</span>
				<ul class="rightoflogo2">
					<li>
						<%
							if (user != null) {
						%> <a href="" onmouseover="mouseOver2()" onmouseout="mouseOut2()"><%=user.getUserName()%>
							<img id="pull2" src="resource/images/pull_down2.png"> </a> <%
 	} else {
 %> <a href="" onmouseover="mouseOver2()" onmouseout="mouseOut2()">用户名
							<img id="pull2" src="resource/images/pull_down2.png">
					</a> <%
 	}
 %>
						<div class="rentlist2 width_set2" onclick=""
							="mouseOver2()" onmouseout="mouseOut2()">
							<div class="rentlist_in2">
								<span> <a href="personal_information.jsp"
									class="cus2  white">个人中心</a> <a href="order.jsp"
									class="mas2  white">我的订单</a>
								</span>
							</div>
						</div>
					</li>
					<li>·</li>
					<li><a href="order.jsp">我的订单</a></li>
					<li>·</li>
					<li><a href="" onmouseover="mouseOver2()"
						onmouseout="mouseOut2()">短租指南 <img id="pull2"
							src="resource/images/pull_down2.png">
					</a>
						<div class="rentlist2 width_set2" onmouseover="mouseOver2()"
							onmouseout="mouseOut2()">
							<div class="rentlist_in2">
								<span> <a href="" class="cus2  white">房客指南</a> <a href=""
									class="mas2  white">房东指南</a>
								</span>
							</div>
						</div></li>
					<li><a href="release.jsp" class="freeroom2 white">免费发布房间</a>
					</li>
				</ul>
			</div>
		</div>

		<div class="inf_con_r">
			<div class="con_head">
				<img src="resource/images/write_inf.png"><span>请填写发布信息</span>
			</div>
			<div class="data_box pa20 wiset float_left" id="identityInfo">
				<form name="signform" action="registHouse.do" method="post"
					enctype="multipart/form-data">
					<%
						if (user != null) {
					%>
					<input type=text style="display: none" name="userId"
						value=<%=user.getId()%>>
					<%
						}
					%>
					<ul class="data_norms">
						<li><label class="w74 align_right">标题：</label> <input
							class="data_norms_input bor_blue" type="text" id="title"
							name="title" value="" style="display: inline-block;"
							placeholder="长安区邮电大学旁欧式简约二室精品套房"></li>
						<li><label class="w74 align_right">城市：</label> <input
							class="data_norms_input" type="text" id="city" name="city"
							value="" style="display: inline-block;" placeholder="西安">
						</li>

						<li><label class="w74 align_right">具体地址：</label> <input
							class="data_norms_input" type="text" placeholder="陕西省西安市长安区西长安街"
							id="houseAddress" name="houseAddress" value=""
							style="display: inline-block;"></li>
						<li><label class="w74 align_right">价格：</label> <input
							class="data_norms_input bor_blue" type="text" id="housePrice"
							name="housePrice" value="" style="display: inline-block;"
							placeholder="162元/晚"></li>
						<li><label class="w74 align_right">居室数量：</label> <input
							class="data_norms_input" type="text" id="people" name="people"
							value="" style="display: inline-block;" placeholder="2">
						</li>

						<li><label class="w74 align_right">面积：</label> <input
							class="data_norms_input" type="text" placeholder="90平米" id="area"
							name="area" value="" style="display: inline-block;"></li>
						<li><label class="w74 align_right">电话：</label> <input
							class="data_norms_input" type="text" id="mobile" name="mobile"
							value="" style="display: inline-block;" placeholder="18829272844">
						</li>

						<li class="tali"><label class="w74 totop align_right">房屋描述：</label>
							<textarea class="describe" type="text" placeholder="欧式风格，浪漫温馨"
								id="houseDescrible" name="houseDescrible" value=""
								style="display: inline-block;"></textarea>
						<li class="tali"><label class="w74 totop align_right">个性描述：</label>
							<textarea class="describe" type="text" id="personality"
								name="personality" value="" style="display: inline-block;"
								placeholder="优势和亮点"></textarea></li>
						<li class="tali"><label class="w74 totop align_right">内部情况：</label>
							<textarea class="describe" type="text" id="internal"
								name="internal" value="" style="display: inline-block;"
								placeholder="家具设施"></textarea></li>
						<li class="tali"><label class="w74 totop align_right">交通情况：</label>
							<textarea class="describe" type="text" placeholder="地段交通是否便利"
								id="traffic" name="traffic" value=""
								style="display: inline-block;"></textarea></li>
						<li class="tali"><label class="w74 totop align_right">周边情况：</label>
							<textarea class="describe" type="text" id="surrounding"
								name="surrounding" value="" style="display: inline-block;"
								placeholder="周围的小区、上场、学校、银行等"></textarea></li>

						<li class="tali"><label class="w74 totop align_right">配套设施：</label>
							<textarea class="describe" type="text"
								placeholder="是否有无线WiFi、淋浴、空调、电视等" id="supportingFacilities"
								name="supportingFacilities" value=""
								style="display: inline-block;"></textarea></li>
						</li>
					</ul>
			</div>
			<div class="img_con_r float_left">
				<img onmouseover="r_mouseOver1()" onmouseout="r_mouseOut1()"
					src="resource/images/room3.jpg">
			</div>
			<div class="img_con_r float_left" onmouseover="r_mouseOver2()"
				onmouseout="r_mouseOut2()">
				<img src="resource/images/room4.jpg">
			</div>
			<div class="img_con_r float_left" onmouseover="r_mouseOver3()"
				onmouseout="r_mouseOut3()">
				<img src="resource/images/room2.jpg">
			</div>

			<div id="add1" class="add_black top1" style="display: none;"
				onmouseover="r_mouseOver1()" onmouseout="r_mouseOut1()">
				<input type="file" class="wby" name="files" onchange="filechange(event)" />
			</div>
			<div id="add2" class="add_black top2" style="display: none;"
				onmouseover="r_mouseOver2()" onmouseout="r_mouseOut2()">
				<input type="file" class="wby" name="files" onchange="filechange(event)" />
			</div>
			<div id="add3" class="add_black top3" style="display: none;"
				onmouseover="r_mouseOver3()" onmouseout="r_mouseOut3()">
				<input type="file" class="wby" name="files" onchange="filechange(event)" />
			</div>
			<%
				if (user != null) {
			%>
			<div class="bt_con">
				<input class="btn_sure" name="" type="submit" value="提交并发布房屋"
					id="contactInfoBtn">
			</div>
			<%
				} else {
			%>
			<div class="bt_con">
				<input class="btn_sure" name="" type="text" value="请先登录"
					id="contactInfoBtn">
			</div>
			<%
				}
			%>
		</div>
		</from>
	</div>