//Function to check whether an element starts with a particular character or string
function checkStart(stringToCheck, subString, editPanel)	{
	stringToCheck = document.getElementById(stringToCheck).value;
	subString = document.getElementById(subString).value;

	if (stringToCheck.startsWith(subString))	{
		editElement(editPanel, "Yes! element starts with " + subString);
	}
	else {
		editElement(editPanel, "No! element don't starts with " + subString);
	}
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
