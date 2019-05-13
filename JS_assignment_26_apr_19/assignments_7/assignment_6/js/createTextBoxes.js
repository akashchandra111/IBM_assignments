function createTextBoxes(howManyToCreate, hereToCreate)	{
	howManyToCreate = parseInt(document.getElementById(howManyToCreate).value);
	attachThisHTML = "";
	for (i=0; i<howManyToCreate; ++i)	{
		attachThisHTML += "<input type='text' id='input_" + i +"'><br>";
	}
	document.getElementById(hereToCreate).innerHTML = attachThisHTML;
}
