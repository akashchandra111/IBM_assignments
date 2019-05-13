//Function to check whether the first element passed is either string or non-string
//object using the regexp
function checkStr(checkForString, editPanel)	{
	checkForString = document.getElementById(checkForString).value;
	pattern = /[a-z,A-Z]+/g;

	if(!checkForString.match(pattern))	{
		editElement(editPanel, "Provided is a not a string!");
	}
	else {
		editElement(editPanel, "Provided is a string!");
	}
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
