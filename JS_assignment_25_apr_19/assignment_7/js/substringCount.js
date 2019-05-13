//Function takes string and compare it with substring and find the occurance time of substring
//in the string
function substringCount(string, subString, editPanel)	{
	string = document.getElementById(string).value;
	subString = document.getElementById(subString).value;
	times = 0;
	while (string.indexOf(subString) != -1)	{
		string = string.replace(subString, '');
		++times;
	}
	editElement(editPanel, "Substring occured " + times + " times");
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
