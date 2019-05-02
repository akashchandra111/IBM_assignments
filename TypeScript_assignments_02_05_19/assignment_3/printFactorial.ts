import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

runtimeVal.question("Enter Number to find factorial: ",
	(answer)=>	{
		var num: number = parseInt(answer);
		var total: number = 1;
		while(num >= 1)	total *= num--;
		console.log(`Factorial is: ${total}`);
		runtimeVal.close();
	}
);
