//Function for sorting text and return the sorted text in string form
function sortText(textToSort, printPanel)	{
	sortedText = document.getElementById(textToSort).value.split('').sort().toString();

	while(sortedText.indexOf(',') != -1)	{
		sortedText = sortedText.replace(',', '');
	}
	editElement(printPanel, sortedText);
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
