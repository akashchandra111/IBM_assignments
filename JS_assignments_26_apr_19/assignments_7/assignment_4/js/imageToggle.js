function imageToggle(toggleThisImage)	{
	if(showImage == true)	{
		document.getElementById(toggleThisImage).style.height = '0px';
		showImage = false;
	}
	else {
		document.getElementById(toggleThisImage).style.height = width_1;
		showImage = true;
	}
}
