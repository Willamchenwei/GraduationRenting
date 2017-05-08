<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="com.chars.model.User"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>用户管理</title>
<link rel="stylesheet" type="text/css" href="resource/css/goods.css">
<link rel="stylesheet" type="text/css"
	href="resource/css/personal_information.css">
<link rel="stylesheet" type="text/css" href="resource/css/user_m.css">
<script src="resource/js/manage.js" type="text/javascript"></script>
</head>
<body>
	<%
		List<User> userList = (List<User>) request.getSession().getAttribute("userList");
	%>
	<div>
		<div class="head bg_white">
			<div class="head_logo2">
				<a href="index.html" class="logo2"></a> <span class="slogan_logo2">四海有家住</span>
				<ul class="rightoflogo2">
					<li>传说中的管理员</li>
				</ul>
			</div>
		</div>
		<div class="all_con2">
			<div class="slideBar_box">
				<ul>
					<li id="s_01" class="cur" onmouseover="mouseOverul1()"><a
						href="user_m.jsp"><img id="order1"
							src="resource/images/order1w.png"><span></span>用户管理</a></li>
					<li id="s_02" class="" onmouseover="mouseOverul2()"
						onmouseout="mouseOutul2()"><a href="house_m.jsp"><img
							id="order2" src="resource/images/order2b.png"><span></span>房屋管理</a></li>
				</ul>
			</div>

			<div id="rank">
				<table id="data-ranks">
					<%
						if (userList != null) {
							Iterator<User> it = userList.iterator();
							while (it.hasNext()) {
								User user = (User) it.next();
					%>
					<tr>
						<td class="tdname"><span>编号：<%=user.getId()%></span></td>
						<td class="widthright"><span>tel:<%=user.getPhone()%></span></td>
					</tr>
					<tr>
						<td class="tdinf" colspan="2"><span><img
								src=<%=user.getPicture()%>></span><span><%=user.getUserName()%></span>
							<form action="removeUser.do" method="post">
								<input type="submit" class="delete_order" value="删除"> 
							</form></td>
					</tr>
					<%
						}
						}
					%>
					<!-- 			<tr>
				<td class="tdname"><span>编号：XXXXXX</span></td>
				<td class="widthright"><span>tel:188 8888 8888</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2"><span><img src="resource/images/headimg.jpg"></span><span>我是一个用户名</span><span class="delete_order">删除</span></td>
			</tr>
			<tr>
				<td class="tdname"><span>编号：XXXXXX</span></td>
				<td class="widthright"><span>tel:188 8888 8888</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2"><span><img src="resource/images/headimg.jpg"></span><span>我是一个用户名</span><span class="delete_order">删除</span></td>
			</tr>
			<tr>
				<td class="tdname"><span>编号：XXXXXX</span></td>
				<td class="widthright"><span>tel:188 8888 8888</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2"><span><img src="resource/images/headimg.jpg"></span><span>我是一个用户名</span><span class="delete_order">删除</span></td>
			</tr>
			<tr>
				<td class="tdname"><span>编号：XXXXXX</span></td>
				<td class="widthright"><span>tel:188 8888 8888</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2"><span><img src="resource/images/headimg.jpg"></span><span>我是一个用户名</span><span class="delete_order">删除</span></td>
			</tr> -->
				</table>
			</div>
		</div>
	</div>

</body>
</html>
