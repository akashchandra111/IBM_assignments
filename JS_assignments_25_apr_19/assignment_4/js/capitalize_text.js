//Function to capitalize the first character by splitting and converting the first character with the remaining string
function capitalizeText(textToChange, editPanel)	{
	newText = document.getElementById(textToChange).value;
	newText = newText.charAt(0).toUpperCase() + newText.replace(newText.charAt(0), '');
	editElement(editPanel, newText);
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
