function mouseOver()
{
document.getElementById('pull').src="resource/images/pull_up.png";
}
function mouseOut()
{
document.getElementById('pull').src="resource/images/pull_down.png";
}

function mouseOver2()
{
document.getElementById('pull2').src="resource/images/pull_up2.png";
}
function mouseOut2()
{
document.getElementById('pull2').src="resource/images/pull_down2.png";
}

function inclick()
{
	document.getElementById('inl').className="nation_name n_cur";
	document.getElementById('ove').className="nation_name";
}

function overclick()
{
	document.getElementById('ove').className="nation_name n_cur";
	document.getElementById('inl').className="nation_name";
}

function openLogin(){
   document.getElementById("win").style.display="";
   document.getElementById("back").style.display="";
   document.body.style.overflow="hidden";
}

function closeLogin(){
   document.getElementById("win").style.display="none";
   document.getElementById("back").style.display="none";
   document.body.style.overflow="";
}

function lclick()
{
	document.getElementById("login_on").className="lands underL1";
	document.getElementById("sign_in").className="lands";
	document.getElementById("l_id").style.display="block";
	document.getElementById("s_id").style.display="none";
}

function sclick()
{
	document.getElementById("sign_in").className="lands underL1";
	document.getElementById("login_on").className="lands";
	document.getElementById("s_id").style.display="block";
	document.getElementById("l_id").style.display="none";
}

function imgclick1()
{
	document.getElementById("roll1").style.display="";
	document.getElementById("roll2").style.display="none";
	document.getElementById("roll3").style.display="none";
	document.getElementById("roll4").style.display="none";
}

function imgclick2()
{
	document.getElementById("roll1").style.display="none";
	document.getElementById("roll2").style.display="";
	document.getElementById("roll3").style.display="none";
	document.getElementById("roll4").style.display="none";
}

function imgclick3()
{
	document.getElementById("roll1").style.display="none";
	document.getElementById("roll2").style.display="none";
	document.getElementById("roll3").style.display="";
	document.getElementById("roll4").style.display="none";
}

function imgclick4()
{
	document.getElementById("roll1").style.display="none";
	document.getElementById("roll2").style.display="none";
	document.getElementById("roll3").style.display="none";
	document.getElementById("roll4").style.display="";
}

function backclick()
{
	var li1 = document.getElementById("roll1").style.display;
	var li2 = document.getElementById("roll2").style.display;
	var li3 = document.getElementById("roll3").style.display;
	var li4 = document.getElementById("roll4").style.display;
	if (li1=="") {imgclick4()}
	if (li2=="") {imgclick1()}
	if (li3=="") {imgclick2()}
	if (li4=="") {imgclick3()}
}

function aheadclick()
{
	var li1 = document.getElementById("roll1").style.display;
	var li2 = document.getElementById("roll2").style.display;
	var li3 = document.getElementById("roll3").style.display;
	var li4 = document.getElementById("roll4").style.display;
	if (li1=="") {imgclick2()}
	if (li2=="") {imgclick3()}
	if (li3=="") {imgclick4()}
	if (li4=="") {imgclick1()}
}

function check(){
	var s = checknick() && checkem() && checkpass1() && checkpass2();		
	return s;	
}
	
function checknick(){
	var s = true;
	if(getid("nickn").value == ""){
		getid("nickn").style.color="red";
		getid("nickn").value="用户名还未填写！";
		getid("nickn").style.backgroundImage="url(resource/images/adm_notok.png)";
		s = false;		
	}
	if(getid("nickn").value.length > 10){
		getid("nickn").style.color="red";
		getid("nickn").value="用户名应小于10个字符！";
		getid("nickn").style.backgroundImage="url(resource/images/adm_notok.png)";
		s = false;
	}
	if(getid("nickn").value=="用户名还未填写！"||getid("nickn").value=="用户名应小于10个字符！"){
		s = false;
	}
	else{
		getid("nickn").style.backgroundImage="url(resource/images/adm_ok.png)";
		s = true;
	}
	return s;
}

function checkem(){
	var reg=/^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/gi;
	if(!reg.test(getid("email").value) && getid("email").value != ""){
		getid("email").style.color="red";
		getid("email").value="邮箱格式不正确！";
		getid("email").style.backgroundImage="url(resource/images/email_notok.png)";
		s = false;
	}
	if(getid("email").value == ""){
		getid("email").style.color="red";
		getid("email").value="邮箱还未填写！";
		getid("email").style.backgroundImage="url(resource/images/email_notok.png)";
		s = false;		
	}
	if(getid("email").value=="邮箱格式不正确！"||getid("email").value=="邮箱还未填写！"){
		s = false;
	}
	else{
		getid("email").style.backgroundImage="url(resource/images/email_ok.png)";
		s = true;
	}
	return s;
}

function checkpass1(){
	var s = true;
	if(getid("pass1").value == ""){
		getid("pass1").style.color="red";
		getid("pass1").type="text";
		getid("pass1").value="还未设置密码！";
		getid("pass1").style.backgroundImage="url(resource/images/adm_notok.png)";
		s = false;		
	}
	if(getid("pass1").value.length < 6 || getid("pass1").value.length > 20){
		getid("pass1").style.color="red";
		getid("pass1").type="text";
		getid("pass1").value="密码为6~20位！";
		getid("pass1").style.backgroundImage="url(resource/images/pas_notok.png)";
		s = false;
	}
	if(getid("pass1").value=="还未设置密码！"||getid("pass1").value=="密码为6~20位！"){
		s = false;
	}
	else{
		getid("pass1").style.backgroundImage="url(resource/images/pas_ok.png)";
		s = true;
	}
	return s;
}

function checkpass2(){
	var s = true;
	if(getid("pass2").value != getid("pass1").value){
		getid("pass2").style.color="red";
		getid("pass2").type="text";
		getid("pass2").value="前后密码不一致";
		getid("pass2").style.backgroundImage="url(resource/images/pas2_notok.png)";
		s = false;		
	}
	else{
		getid("pass2").style.backgroundImage="url(resource/images/pas2_ok.png)";
		s = true;
	}
	return s;
}

function focus_nick(){
	getid("nickn").style.color="#000";
	if(getid("nickn").value=="用户名还未填写！"||getid("nickn").value=="用户名应小于10个字符！"){
		getid("nickn").value = "";
	}	
}

function focus_email(){
	getid("email").style.color="#000";
	if(getid("email").value=="邮箱格式不正确！"||getid("email").value=="邮箱还未填写！"){
		getid("email").value = "";
	}
}

function focus_pass1(){
	getid("pass1").style.color="#000";
	getid("pass1").type="password";
	if(getid("pass1").value=="还未设置密码！"||getid("pass1").value=="密码为6~20位！"){
		getid("pass1").value = "";
	}	
}

function focus_pass2(){
	getid("pass2").style.color="#000";
	getid("pass2").type="password";
	if(getid("pass2").value=="前后密码不一致"){
		getid("pass2").value = "";
	}	
}

function getid(id){
	return document.getElementById(id);
}