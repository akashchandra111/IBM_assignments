//Function takes string and splits it into array and prints it.
function numToArray(number, elementToEdit)	{
	console.log(document.getElementById(number).value.split(''));
	editElement(elementToEdit, document.getElementById(number).value.split(''));
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
