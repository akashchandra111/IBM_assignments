//Function to print the day and time
function dateTime(editPanel)	{
	dayNum = new Date().getDay().toString();
	day = "Today:  "

	switch(dayNum)	{
		case "1":
			day += "Monday";
			break;
		case "2":
			day += "Tuesday";
			break;
		case "3":
			day += "Wednesday";
			break;
		case "4":
			day += "Thursday";
			break;
		case "5":
			day += "Friday";
			break;
		case "6":
			day += "Saturday";
			break;
		case "7":
			day += "Sunday";
			break;
		default:
			day += "Fault";
	}
	time = "Time is:  ";
	time += parseInt(new Date().getHours())%12 + "hrs" + " : " + new Date().getMinutes() + "min" + " : " + new Date().getSeconds() + "secs";

	editElement(editPanel, day + "<br>" + time);
}

function editElement(element, text)	{
	document.getElementById(element).innerHTML = text;
}
