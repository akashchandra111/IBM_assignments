//Function to merge two strings and remove the words which are occuring multiple times
//in the joint string
function mergeRemoveElements(string1, string2, editPanel)	{
	string1 = document.getElementById(string1).value;
	string2 = document.getElementById(string2).value;

	newStr = string1 + " " + string2;
	newStrArr = newStr.split(" ").sort();
	for (i=0; i<newStrArr.length; ++i)	{
		if(newStrArr[i] == newStrArr[i+1])	{
			while(newStr.indexOf(newStrArr[i]) != -1)	{
				newStr = newStr.replace(newStrArr[i], '');
			}
		}
	}
	editElement(editPanel, newStr);
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
