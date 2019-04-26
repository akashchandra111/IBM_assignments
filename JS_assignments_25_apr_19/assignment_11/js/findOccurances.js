//Function to check the repeated occurance of a word in a string and return the number
//of its occurance
function findOccurances(stringToTest, occuranceString, editPanel)	{
	stringToTest = document.getElementById(stringToTest).value;
	occuranceString = document.getElementById(occuranceString).value

	counter = 0;

	while(stringToTest.indexOf(occuranceString) != -1)	{
		stringToTest = stringToTest.replace(occuranceString, '');
		++counter;
	}

	editElement(editPanel, "Element occured " + counter + " times!");
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
