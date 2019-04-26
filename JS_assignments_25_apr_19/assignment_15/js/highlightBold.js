//Function to highlight the bold character present in the BODY tag of HTML
function highlightBold()	{
	bolds = document.getElementsByTagName('b');

	for(i=0; i<bolds.length; ++i)	{
		bolds[i].style.backgroundColor = "yellow";
	}
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
