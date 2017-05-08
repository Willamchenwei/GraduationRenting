function imgclick1()
{
	document.getElementById("img_bg1").className="img_cur top1";
	document.getElementById("img_bg2").className="img_layer top2";
	document.getElementById("img_bg3").className="img_layer top3";
	document.getElementById("li_dis1").style.display="";
	document.getElementById("li_dis2").style.display="none";
	document.getElementById("li_dis3").style.display="none";
}

function imgclick2()
{
	document.getElementById("img_bg1").className="img_layer top1";
	document.getElementById("img_bg2").className="img_cur top2";
	document.getElementById("img_bg3").className="img_layer top3";
	document.getElementById("li_dis1").style.display="none";
	document.getElementById("li_dis2").style.display="";
	document.getElementById("li_dis3").style.display="none";
}

function imgclick3()
{
	document.getElementById("img_bg1").className="img_layer top1";
	document.getElementById("img_bg2").className="img_layer top2";
	document.getElementById("img_bg3").className="img_cur top3";
	document.getElementById("li_dis1").style.display="none";
	document.getElementById("li_dis2").style.display="none";
	document.getElementById("li_dis3").style.display="";
}

function uplick()
{
	var li1 = document.getElementById("li_dis1").style.display;
	var li2 = document.getElementById("li_dis2").style.display;
	var li3 = document.getElementById("li_dis3").style.display;
	if (li1=="") {imgclick3()}
	if (li2=="") {imgclick1()}
	if (li3=="") {imgclick2()}
}

function downlick()
{
	var li1 = document.getElementById("li_dis1").style.display;
	var li2 = document.getElementById("li_dis2").style.display;
	var li3 = document.getElementById("li_dis3").style.display;
	if (li1=="") {imgclick2()}
	if (li2=="") {imgclick3()}
	if (li3=="") {imgclick1()}
}