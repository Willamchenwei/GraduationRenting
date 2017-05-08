<!DOCTYPE html>
<%@page import="com.chars.model.User"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>我的订单</title>
	<link rel="stylesheet" type="text/css" href="resource/css/goods.css">
	<link rel="stylesheet" type="text/css" href="resource/css/personal_information.css">
	<link rel="stylesheet" type="text/css" href="resource/css/order.css">
	<script src="resource/js/personal_information.js" type="text/javascript"></script>
</head>
<body>
<%
	User user = (User) request.getSession().getAttribute("user");
%>
<div>
	<div class="head bg_white">
		<div class="head_logo2">
			<a href="index.jsp" class="logo2"></a>
			<span class="slogan_logo2">四海有家住</span>
			<ul class="rightoflogo2">
				<li>
					<a href=""  onmouseover="mouseOver2()" onmouseout="mouseOut2()"><%if (user != null) %>用户名
						<img id="pull2" src="resource/images/pull_down2.png">
					</a>
					<div class="rentlist2 width_set2"  onclick="" ="mouseOver2()" onmouseout="mouseOut2()">
						<div class="rentlist_in2">
							<span>
								<a href="personal_information.jsp" class="cus2  white">个人中心</a>
								<a href="order.jsp" class="mas2  white">我的订单</a>
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
					<a href="release.jsp" class="freeroom2 white">免费发布房间</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="con_height" class="all_con2" style="height:700px;">
	<div class="slideBar_box">
		<ul>			                                 
			<li id="s_01" class="cur" onmouseover="mouseOverul1()"><a href="order.html"><img id="order1" src="resource/images/order1w.png"><span></span>订单</a></li>
			<li id="s_02" class="" onmouseover="mouseOverul2()" onmouseout="mouseOutul2()"><a href="my_message.html"><img id="order2" src="resource/images/order2b.png"><span></span>我的消息</a></li>			          
			<li id="s_03" class="" onmouseover="mouseOverul3()" onmouseout="mouseOutul3()"><a href="personal_information.html"><img id="order3" src="resource/images/order3b.png"><span></span>个人资料</a></li>						            
		</ul>
	</div>

	<div id="rank">
		<table id="data-ranks">
			<tr class="bg_pink">
				<td class="tdname"><span>订单编号：XXXXXX</span></td>
				<td class="widthright"><span>下单日期：xxxx年xx月xx日</span></td>
			</tr>
			<tr>
				<td class="tdinf"colspan="2">
					<span>XXX元/晚</span><span>xxxx入住 - xxxx离开</span>
					<input class="delete_order" value="取消订单"  type="submit" >
					<input class="comment" onclick="com_click1()" value="评论"  type="submit" >
				</td>
			</tr>
			<tr id="com1" style="display:none;">
				<td class="" colspan="2">
					<textarea class="comment_text"></textarea>
					<input class="sub" value="提交" type="submit">
				</td>
			</tr>
			<tr class="bg_pink">
				<td class="tdname"><span>订单编号：XXXXXX</span></td>
				<td class="widthright"><span>下单日期：xxxx年xx月xx日</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2">
					<span>XXX元/晚</span>
					<span>xxxx入住 - xxxx离开</span>
					<input class="delete_order" value="取消订单"  type="submit" >
					<input class="comment" onclick="com_click2()" value="评论"  type="submit" >
				</td>
			</tr>
			<tr id="com2" style="display:none;">
				<td class="" colspan="2">
					<textarea class="comment_text"></textarea>
					<input class="sub" value="提交" type="submit">
				</td>
			</tr>
			<tr class="bg_pink">
				<td class="tdname"><span>订单编号：XXXXXX</span></td>
				<td class="widthright"><span>下单日期：xxxx年xx月xx日</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2">
					<span>XXX元/晚</span>
					<span>xxxx入住 - xxxx离开</span>
					<input class="delete_order" value="取消订单"  type="submit" >
					<input class="comment" onclick="com_click3()" value="评论"  type="submit" >
				</td>
			</tr>
			<tr id="com3" style="display:none;">
				<td class="" colspan="2">
					<textarea class="comment_text"></textarea>
					<input class="sub" value="提交" type="submit">
				</td>
			</tr>
			<tr class="bg_pink">
				<td class="tdname"><span>订单编号：XXXXXX</span></td>
				<td class="widthright"><span>下单日期：xxxx年xx月xx日</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2">
					<span>XXX元/晚</span>
					<span>xxxx入住 - xxxx离开</span>
					<input class="delete_order" value="取消订单"  type="submit" >
					<input class="comment" onclick="com_click4()" value="评论"  type="submit" >
				</td>
			</tr>
			<tr id="com4" style="display:none;">
				<td class="" colspan="2">
					<textarea class="comment_text"></textarea>
					<input class="sub" value="提交" type="submit">
				</td>
			</tr>
			<tr class="bg_pink">
				<td class="tdname"><span>订单编号：XXXXXX</span></td>
				<td class="widthright"><span>下单日期：xxxx年xx月xx日</span></td>
			</tr>
			<tr>
				<td class="tdinf" colspan="2">
					<span>XXX元/晚</span>
					<span>xxxx入住 - xxxx离开</span>
					<input class="delete_order" value="取消订单"  type="submit" >
					<input class="comment" onclick="com_click5()" value="评论"  type="submit" >
				</td>
			</tr>
			<tr id="com5" style="display:none;">
				<td class="" colspan="2">
					<textarea class="comment_text"></textarea>
					<input class="sub" value="提交" type="submit">
				</td>
			</tr>
		</table>
</div>
	</div>
</div>
	
</body>
</html>	           