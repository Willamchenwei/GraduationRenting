<!DOCTYPE html>
<%@page import="com.chars.model.User"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>个人中心</title>
<link rel="stylesheet" type="text/css" href="resource/css/goods.css">
<link rel="stylesheet" type="text/css"
	href="resource/css/personal_information.css">
<script src="resource/js/personal_information.js" type="text/javascript"></script>
</head>
<body>
	<%
		User user = (User) request.getSession().getAttribute("user");
	%>
	
	<div>
		<div class="head bg_white">
			<div class="head_logo2">
				<a href="index.html" class="logo2"></a> <span class="slogan_logo2">四海有家住</span>
				<ul class="rightoflogo2">
					<li><a href="" onmouseover="mouseOver2()"
						onmouseout="mouseOut2()"><%if (user != null)  {%> <%=user.getUserName() %> <%} else { %>用户名<%} %> <img id="pull2"
							src="resource/images/pull_down2.png">
					</a>
						<div class="rentlist2 width_set2" onclick=""
							="mouseOver2()" onmouseout="mouseOut2()">
							<div class="rentlist_in2">
								<span> <a href="personal_information.jsp"
									class="cus2  white">个人中心</a> <a href="order.jsp"
									class="mas2  white">我的订单</a>
									<a href="index.jsp"
									class="mas2  white">返回首页</a>
								</span>
							</div>
						</div></li>
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
		<div class="all_con">
			<div class="slideBar_box">
				<ul>
					<li id="s_01" class="" onmouseover="mouseOverul1()"
						onmouseout="mouseOutul1()"><a href="order.jsp"><img
							id="order1" src="resource/images/order1b.png"><span></span>预定订单</a></li>
					<li id="s_02" class="" onmouseover="mouseOverul2()"
						onmouseout="mouseOutul2()"><a href="my_release.jsp"><img
							id="order2" src="resource/images/order2b.png"><span></span>发布订单</a></li>
					<li id="s_04" class="" onmouseover="mouseOverul4()" onmouseout="mouseOutul4()"><a href="my_house.jsp"><img id="order4" src="resource/images/order4b.png"><span></span>发布房屋</a></li>
					<li id="s_03" class="cur" onmouseover="mouseOverul3()"><a
						href="personal_information.jsp"><img id="order3"
							src="resource/images/order3w.png"><span></span>个人资料</a></li>
				</ul> 
			</div>
			<form name="signform" action="userDetail.do" method="post"
				enctype="multipart/form-data">
			<%if (user != null) { %>
				<input type="text" style="display: none" name="id"
					<%if (user != null) { %>value="<%=user.getId()%>"> <%} %>
			
				<div class="personal_con">
					<div class="headimg" onmouseover="mouseOver()"
						onmouseout="mouseOut()">
						<%if (user.getPicture() == null) { %>
						<a href=""><img src="resource/images/headimg.jpg"></a>
						<%} else { %>
						<a href=""><img src="<%=user.getPicture() %>"></a>
						<%} %>
					</div>
					<div id="invisible" class="blackimg" style="display: none;"
						onmouseover="mouseOver()" onmouseout="mouseOut()">
						<a href=""><input type="file" class="headimg_load" name="files" /></a>
					</div>

					<div class="data_box pa20" id="identityInfo">
						<h4 class="data_tit">
							身份信息
						</h4>
						<ul class="data_norms">
							<li><label class="w74">用户名</label> <input
								class="data_norms_input bor_blue" type="text" id="userName" name = "userName"
								<%if (user.getUserName() != null) {%>value=<%=user.getUserName() %> <%} %> style="display: inline-block;" placeholder="请输入用户名">
							</li>
							<li><label class="w74">密码：</label> <input
								class="data_norms_input" type="password" id="password" name = "password" <%if (user.getPassword() != null)  {%> value=<%=user.getPassword() %> <%} %>
								style="display: inline-block;" placeholder="请输入新密码"></li>

							<li><label class="w74">性别：</label> <input
								class="data_norms_input" type="text" placeholder="请输入性别"
								id="sex" name = "sex" <%if (user.getSex() != null) { %>value=<%=user.getSex() %><%} %> style="display: inline-block;"></li>
							<li><label class="w74">真实姓名：</label> <input
								class="data_norms_input bor_blue" type="text" id="realName" name = "realName"
								<%if (user.getRealName() != null) { %> value=<%=user.getRealName() %> <%}else { %> value = "" <%} %>style="display: inline-block;" placeholder="请输入真实姓名">
							</li>
							<li><label class="w74">身份证：</label> <input
								class="data_norms_input" type="text" id="idCard" name = "idCard" <%if (user.getIdCard() != null) { %> value=<%=user.getIdCard()%><%} else { %> value = "" <%} %>
								style="display: inline-block;" placeholder="请输入身份证号码"></li>

							<li><label class="w74">地址：</label> <input
								class="data_norms_input" type="text" placeholder="请输入地址"
								id="address" name = "address" <%if (user.getAddress() != null) { %>value=<%=user.getAddress() %> <%} else { %> value = "" <%} %>style="display: inline-block;"></li>
							<li><label class="w74">电话：</label> <input
								class="data_norms_input" type="text" id="phone" name = "phone" <%if (user.getPhone() != null) {%>value=<%=user.getPhone() %><%} else { %> value = "" <%} %>
								style="display: inline-block;" placeholder="请输入电话号码"></li>

							<li><label class="w74">邮箱：</label> <input
								class="data_norms_input" type="text" placeholder="请输入邮箱"
								id="emil" name = "emil" <%if (user.getEmil()!= null) { %>value=<%=user.getEmil() %> <%} else { %> value = "" <%} %>style="display: inline-block;"></li>
						</ul>
					</div>
				</div>
		</div>
	</div>
<%} %>
	<div class="bt_con_p">
		<input class="btn_sure_p" name="" type="submit" value="提交并保存信息"
			id="contactInfoBtn">
	</div>

</body>
</html>