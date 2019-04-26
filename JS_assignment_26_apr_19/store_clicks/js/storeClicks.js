function storeClicks(editPanel)	{
	if(localStorage.getItem("clicks") == null)	{
		localStorage.setItem("clicks", "1");
	}
	else {
		localStorage.setItem("clicks", parseInt(localStorage.getItem("clicks")) + 1);;
	}
	document.getElementById(editPanel).innerHTML = "Total clicks: " + localStorage.getItem("clicks");
}
