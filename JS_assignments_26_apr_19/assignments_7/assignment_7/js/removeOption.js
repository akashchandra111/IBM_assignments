function removeDropdownOption(selectId, removeThis)	{
	selectedId = document.getElementById(selectId);
	removeThis = document.getElementById(removeThis).value;

	for (i=0; i<parseInt(selectedId.length); ++i)	{
		if(selectedId[i].value == removeThis)	{
			selectedId[i].hidden = true;
		}
	}
}
