//Function to check whether a letter is uppercase provided the index
function checkUpperCase(stringToTest, index, editPanel)	{
	stringToTest = document.getElementById(stringToTest).value;
	index = parseInt(document.getElementById(index).value);
	pattern = /[A-Z]+/g;

	if(stringToTest.charAt(index).match(pattern) != null)	{
		editElement(editPanel, "Selected element is UpperCase");
	}
	else {
		editElement(editPanel, "Selected element is NOT UpperCase");
	}
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
