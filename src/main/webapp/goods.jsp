<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="com.chars.model.DetailInformation"%>
<%@page import="java.util.List"%>
<%@page import="com.chars.model.User"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>商品展示</title>
	<link rel="stylesheet" type="text/css" href="resource/css/goods.css">
	<link rel="stylesheet" type="text/css" href="resource/css/index.css">
	<script src="resource/js/index.js" type="text/javascript"></script>
</head>
<body>
<%
	User user = (User) request.getSession().getAttribute("user");
	List<DetailInformation> detailList = (List<DetailInformation>) request.getSession().getAttribute("searchDetailList");
	
%>
<div>
	<div class="head bg_white">
		<div class="head_logo2">
			<a href="index.html" class="logo2"></a>
			<span class="slogan_logo2">四海有家住</span>
			<ul class="rightoflogo2">
				<li>
					<a href=""  onmouseover="mouseOver2()" onmouseout="mouseOut2()"><%if (user != null)  {%> <%=user.getUserName() %> <%} else { %>用户名<%} %>
						<img id="pull2" src="resource/images/pull_down2.png">
					</a>
					<div class="rentlist2 width_set2"  onmouseover="mouseOver2()" onmouseout="mouseOut2()">
						<div class="rentlist_in2">
							<span>
								<a href="personal_information.jsp" class="cus2  white">个人中心</a>
								<a href="order.jsp" class="mas2  white">我的订单</a>
								<a href="index.jsp" class="mas2  white">返回首页</a>
							</span>
						</div>
					</div>
				</li>
				<li>·</li>
				<li>
					<a href="order.jsp">我的订单</a>
				</li>
				<li>·</li>
				<li>
					<a href=""  onmouseover="mouseOver2()" onmouseout="mouseOut2()">短租指南
						<img id="pull2" src="resource/images/pull_down2.png">
					</a>
					<div class="rentlist2 width_set2"  onmouseover="mouseOver2()" onmouseout="mouseOut2()">
						<div class="rentlist_in2">
							<span>
								<a href="" class="cus2  white">房客指南</a>
								<a href="" class="mas2  white">房东指南</a>
							</span>
						</div>
					</div>
				</li>
				<li>
					<a href="release.html" class="freeroom2 white">免费发布房间</a>
				</li>
			</ul>
		</div>
	</div>
	<div class="goods_con">
	<%if (detailList != null) {
		if (detailList.size() != 0) {
			Iterator<DetailInformation> it = detailList.iterator();
			while (it.hasNext()) {
				DetailInformation detail = it.next();
		%>
	
			<div class="goods_inf">
				<div class="img_con">
					<a href=""><img src=<%=detail.getHousePicture1() %>></a>
				</div>
				<div class="rooms_intro">
					<img class="img_user_fd" lazy_src="finish"
						src=<%=detail.getPicture() %>> <span class="room_name"><%=detail.getTitle() %>
						- <%=detail.getCity() %></span> <span class="index_price"><em class="bigFont">¥</em><%=detail.getHousePrice() %></span>
				</div>
				<form name="sign" action="loadDetailHouseInformation.do" method="post"
				enctype="multipart/form-data">
			
				<input type="text" style="display: none" name="id"
					value="<%=detail.getHouseId()%>">
				<input class="bg_black" type="submit">
				</form>
			</div>
		<%}}} %>
		<!-- <div class="goods_inf">
			<input type="image" src="resource/images/room4.jpg" class="img_con">
			<div class="inf_con">
				<span class="price">XXX元/晚</span>
				<div class="detail_con">
					<span class="house_head">房屋标题</span>
					<span class="house_inf">房屋信息</span>
				</div>
			</div>
		</div>
		<div class="goods_inf">
			<input type="image" src="resource/images/room4.jpg" class="img_con">
			<div class="inf_con">
				<span class="price">XXX元/晚</span>
				<div class="detail_con">
					<span class="house_head">房屋标题</span>
					<span class="house_inf">房屋信息</span>
				</div>
			</div>
		</div>
		<div class="goods_inf">
			<input type="image" src="resource/images/room4.jpg" class="img_con">
			<div class="inf_con">
				<span class="price">XXX元/晚</span>
				<div class="detail_con">
					<span class="house_head">房屋标题</span>
					<span class="house_inf">房屋信息</span>
				</div>
			</div>
		</div>
		<div class="goods_inf">
			<input type="image" src="resource/images/room4.jpg" class="img_con">
			<div class="inf_con">
				<span class="price">XXX元/晚</span>
				<div class="detail_con">
					<span class="house_head">房屋标题</span>
					<span class="house_inf">房屋信息</span>
				</div>
			</div>
		</div>
		<div class="goods_inf">
			<input type="image" src="resource/images/room4.jpg" class="img_con">
			<div class="inf_con">
				<span class="price">XXX元/晚</span>
				<div class="detail_con">
					<span class="house_head">房屋标题</span>
					<span class="house_inf">房屋信息</span>
				</div>
			</div>
		</div> -->
<!-- 		<div class="pagination_v2">
			<a class="first_st" target="_self" href="">&lt;</a>
			<span class="active_link">1</span>
			<a target="_self" href="">2</a>
			<a target="_self" href="">3</a>
			<a target="_self" href="">4</a>
			<a target="_self" href="">5</a>
			<a class="last_st" target="_self" href="">&gt;</a>
		</div> -->
	</div>
</div>
	
</body>
</html>