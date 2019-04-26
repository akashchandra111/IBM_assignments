function animateThis(element)	{
	if(showBox == true)	{
		console.log(showBox);
		document.getElementById(element).style.width = '200px';
		document.getElementById(element).style.height = '200px';
		document.getElementById(element).style.backgroundColor = "blue";
		document.getElementById(element).style.transition = "1s all ease";
		showBox = false;
	}
	else if(showBox == false)	{
		console.log(showBox);
		document.getElementById(element).style.width = '100px';
		document.getElementById(element).style.height = '100px';
		document.getElementById(element).style.backgroundColor = "red";
		document.getElementById(element).style.transition = "1s all ease";
		showBox = true;
	}
}
