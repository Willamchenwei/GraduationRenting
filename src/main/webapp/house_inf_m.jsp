<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.chars.model.Discuss"%>
<%@page import="com.chars.model.DetailInformation"%>
<%@page import="com.chars.model.User"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>详细信息</title>
	<link rel="stylesheet" type="text/css" href="resource/css/goods.css">
	<link rel="stylesheet" type="text/css" href="resource/css/personal_information.css">
	<link rel="stylesheet" type="text/css" href="resource/css/order.css">
	<link rel="stylesheet" type="text/css" href="resource/css/house_information.css">
	<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="resource/js/dateRange.js"></script>
	<link rel="stylesheet" type="text/css" href="resource/css/dateRange.css"/>
	<script src="resource/js/house_information.js" type="text/javascript"></script>
</head>
<body>
<%
	DetailInformation detailInformation = (DetailInformation) request.getSession().getAttribute("managerHouseDetailInformation");
%>
<div>
	<%if (detailInformation != null) { %>

	<div class="all_con_house">
		<div class="house_inf_left">
			<h4>
                <em><%=detailInformation.getTitle() %></em>
            </h4>
            <p><span><%=detailInformation.getHouseAddress() %></span></p>
            <div class="threeimg_con">
            	<div class="big_img">
            		
	            	<ul class="threeimg_ul">
		            	<div class="up_down">
	            			<div class="up" onclick="uplick()"></div>
	            			<div class="down" onclick="downlick()"></div>
	            		</div>
						<li id="li_dis1" style="display: ;">
							<a href="">
								<img src=<%=detailInformation.getHousePicture1() %>>
							</a>
						</li>
						<li id="li_dis2" style="display: none;">
							<a href="">
								<img src=<%=detailInformation.getHousePicture2() %>>
							</a>
						</li>
						<li id="li_dis3" style="display: none;">
							<a href="">
								<img src=<%=detailInformation.getHousePicture3() %>>
							</a>
						</li>
					</ul>
				</div>
				<div class="small_img">
					<ul class="small_img_ul">
						<li>
							<div id="img_bg1" class="img_cur top1" onclick="imgclick1()"></div>
							<img src=<%=detailInformation.getHousePicture1() %>>
						</li>
						<li>
							<div id="img_bg2" class="img_layer top2" onclick="imgclick2()"></div>
							<img src=<%=detailInformation.getHousePicture2() %>>
						</li>
						<li>
							<div id="img_bg3" class="img_layer top3" onclick="imgclick3()"></div>
							<img src=<%=detailInformation.getHousePicture3() %>>
						</li>
					</ul>
				</div>
            </div>
            <div class="house_inf_con">
            	<ul class="house_info">
                 	<li class="border_none">
                    	<h6><%=detailInformation.getHousePrice() %>元/晚</h6>
                	</li>
                 	<li>
                   	  	<h6><%=detailInformation.getPeople() %></h6>
                	</li>
                 	<li>
                    	<h6><%=detailInformation.getArea() %>平米</h6>
                	</li>
             	</ul>
             	<div class="box_white">
                 	<div class="info_l">
                    	<p>个性描述</p>
                 	</div>
                 	<div class="info_r">
                     	<p><%=detailInformation.getPersonality() %>
						</p>
                    </div>
                </div>
                <div class="box_black">
                 	<div class="info_l">
                    	<p>内部情况</p>
                 	</div>
                 	<div class="info_r">
                     	<p><%=detailInformation.getInternal() %>
						</p>
                    </div>
                </div>
                <div class="box_white">
                 	<div class="info_l">
                    	<p>交通情况</p>
                 	</div>
                 	<div class="info_r">
                     	<p><%=detailInformation.getTraffic() %>
						</p>
                    </div>
                </div>
                <div class="box_black">
                 	<div class="info_l">
                    	<p>周边情况</p>
                 	</div>
                 	<div class="info_r">
                     	<p><%=detailInformation.getSurrounding() %>
						</p>
                    </div>
                </div>
                <div class="box_white">
                 	<div class="info_l">
                    	<p>配套设施</p>
                 	</div>
                 	<div class="info_r">
                     	<p><%=detailInformation.getSupportingFacilities() %><br>
						</p>
                    </div>
                </div>
                	<%
                	}%>
                	                	<!-- <div class="floor">
                		<div class="floor1">
                			<span class="pink">我是一个路人甲</span>
                			<span>入住时间：xxxx年xx月</span>
                		</div>
                		<div class="floor2">
                			<span>美女房东很热情、很爱干净、我们一家老小住</span>
                		</div>
                	</div> -->
                	                	<!-- <div class="floor">
                		<div class="floor1">
                			<span class="pink">楼下是我儿子</span>
                			<span>入住时间：xxxx年xx月</span>
                		</div>
                		<div class="floor2">
                			<span>房东热情，细心，介绍了很多当地的美食，以及详细的交通介绍。房子挺干净的，位置虽然不在鼓楼等中心地区，但是地铁非常方便，推荐坐火车到北站的朋友可以直接坐地铁从北站到航天城站下车。房子对面有个大超市，购物也非常方便，总体来说很不错。</span>
                		</div>
                	</div> -->
                	                	<!-- <div class="floor">
                		<div class="floor1">
                			<span class="pink">人可人圭光翟</span>
                			<span>入住时间：xxxx年xx月</span>
                		</div>
                		<div class="floor2">
                			<span>第一次用小猪，房子住了三天，性价比超高，还能做饭，我们晚上入住了，挺好找的，房东有问必答，挺满意</span>
                		</div>
                	</div> -->
                	                	<!-- <div class="floor">
                		<div class="floor1">
                			<span class="pink">好名字都被狗吃了</span>
                			<span>入住时间：xxxx年xx月</span>
                		</div>
                		<div class="floor2">
                			<span>非常棒，下次再来。</span>
                		</div>
                	</div> -->
                </div>
            </div>

		</div>
		
	</div>

</div>
</body>
</html>