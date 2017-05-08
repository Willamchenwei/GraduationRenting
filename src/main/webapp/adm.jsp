<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>管理员登录</title>
	<link rel="stylesheet" type="text/css" href="resource/css/adm.css">
</head>
<body>
	<div id="login_frame">
		<div class="TC"><span class="span">芒果租赁<br>管理员登录</span></div>
		<div class="login_form">
			<div class="logo_img" align="center">
				<img src="resource/images/mango.png" class="logo"/>
			</div>
			<form name="loginform" action="managerLogin.do" method="post" >
				<div class="user_name" align="center">
					<input class="name_text" type="text" name="userName" placeholder="用户名"/>
				</div>
				<div class="password" align="center">
					<input class="password_text" type="password" name="password" placeholder="密码"/>
				</div>
				<div class="login green">
					<button class='login_button' type="submit">登录</button>
				</div>
			</form>
		</div>
	</div>	
</body>
</html>