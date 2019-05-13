//Function to find the non-repeating characters in the string by removing the
//repeated characters
function nonRepChars(string, editPanel)	{
	string = document.getElementById(string).value;
	sortedArr = string.split('').sort();

	for(i=0; i<sortedArr.length; ++i)	{
		if(sortedArr[i] == sortedArr[i+1])	{
			while(string.indexOf(sortedArr[i]) != -1)	{
				string = string.replace(sortedArr[i], '');
			}
		}
	}
	editElement(editPanel, string);
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
