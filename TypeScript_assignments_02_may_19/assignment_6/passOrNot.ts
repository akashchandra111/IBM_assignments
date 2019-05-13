import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

function passOrNot(num1?: number, num2?: number, num3?: number)	{
	// if(num1 >= 40)	{
	// 	if(num2 >= 40)	{
	// 		if(num3 >= 40)	{
	// 			if(num1 + num2 + num3 >= 125)	{
	// 				console.log("Passed");
	// 			}
	// 		}
	// 	}
	// }
	// else	{
	// 	console.log("Failed");
	// }
	let result: boolean = true;
	let totalSum: number = num1 + num2 + num3;
	if(totalSum < 125)	{
		result = false;
	}
	if (num1 < 40)	{
		result = false;
	}
	if (num2 < 40)	{
		result = false;
	}
	if (num3 < 40)	{
		result = false;
	}

	//Test for result
	if(result == false)	{
		console.log("Failed! :(");
	}
	else	{
		console.log("Passed! :)");
	}
}

runtimeVal.question("Enter all 3 numbers with spaces: ",
	(answer)=>	{
		let sub = answer.split(" ");
		let sub_1 = parseInt(sub[0]);
		let sub_2 = parseInt(sub[1]);
		let sub_3 = parseInt(sub[2]);

		passOrNot(sub_1, sub_2, sub_3);
		runtimeVal.close();
	}
);
