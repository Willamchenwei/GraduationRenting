function mouseOver()
{
	document.getElementById("invisible").style.display="";
}
function mouseOut()
{
	document.getElementById("invisible").style.display="none";
}

function mouseOverul1()
{
	document.getElementById("s_01").className="cur";
	document.getElementById("order1").src="resource/images/order1w.png";
}

function mouseOutul1()
{
	document.getElementById("s_01").className="";
	document.getElementById("order1").src="resource/images/order1b.png";
}

function mouseOverul2()
{
	document.getElementById("s_02").className="cur";
	document.getElementById("order2").src="resource/images/order2w.png";
}

function mouseOutul2()
{
	document.getElementById("s_02").className="";
	document.getElementById("order2").src="resource/images/order2b.png";
}

function mouseOverul3()
{
	document.getElementById("s_03").className="cur";
	document.getElementById("order3").src="resource/images/order3w.png";
}

function mouseOutul3()
{
	document.getElementById("s_03").className="";
	document.getElementById("order3").src="resource/images/order3b.png";
}

function mouseOverul4()
{
	document.getElementById("s_04").className="cur";
	document.getElementById("order4").src="resource/images/order4w.png";
}

function mouseOutul4()
{
	document.getElementById("s_04").className="";
	document.getElementById("order4").src="resource/images/order4b.png";
}

var click1 = true;
var click2 = true;
var click3 = true;
var click4 = true;
var click5 = true;
function com_click1()
{
	if(click1 == true){
		document.getElementById("com1").style.display="";
		click1 = false;
	}
	else{
		document.getElementById("com1").style.display="none";
		click1 = true;
	}
	
}

function com_click2()
{
	if(click2 == true){
		document.getElementById("com2").style.display="";
		click2 = false;
	}
	else{
		document.getElementById("com2").style.display="none";
		click2 = true;
	}
}

function com_click3()
{
	if(click3 == true){
		document.getElementById("com3").style.display="";
		click3 = false;
	}
	else{
		document.getElementById("com3").style.display="none";
		click3 = true;
	}
}

function com_click4()
{
	if(click4 == true){
		document.getElementById("com4").style.display="";
		click4 = false;
	}
	else{
		document.getElementById("com4").style.display="none";
		click4 = true;
	}
}

function com_click5()
{
	if(click5 == true){
		document.getElementById("com5").style.display="";
		click5 = false;
	}
	else{
		document.getElementById("com5").style.display="none";
		click5 = true;
	}
}