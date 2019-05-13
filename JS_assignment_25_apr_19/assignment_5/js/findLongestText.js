//Function to find longest word in string using a longestText watcher
function longestTextInString(findInText, editPanel)	{
	textArray = document.getElementById(findInText).value.split(' ');
	longestText = "";
	for (i=0; i<textArray.length; ++i)	{
		if(longestText.length < textArray[i].length)	longestText = textArray[i];
		editElement(editPanel, longestText);
	}
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
