//Function to match the guessed Value with the generated random Value present in
//index.html

function guessNum(randomNum, userVal, elementToEdit)	{

	if (randomNum == parseInt(document.getElementById(userVal).value))	{
		editElement(elementToEdit, "Right On! :) : " + randomNum);
	}
	else {
		editElement(elementToEdit, "Unlucky :(");
	}
}

//Function to print the text in the 'element'
function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
