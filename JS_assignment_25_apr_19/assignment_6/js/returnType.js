//Currently not working
function returnValueType(element, editPanel)	{
	editElement(editPanel, "Type is: " );
}

//Use this function in console to identify the type of any object passed as first parameter
//Use second parameter to print it in desired element of HTML
function returnValueType_1(element, editPanel)	{
	editElement(editPanel, typeof(element));
}

//Simple element text editor
function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
