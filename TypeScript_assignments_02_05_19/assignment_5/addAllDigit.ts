import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

runtimeVal.question("Enter the number to find it's sum: ",
	(answer)=>	{
		var num: number = parseInt(answer);
		var total: number = 0;
		while(num != 0)	{
			total += num % 10;
			num = Math.floor(num/10);
		}
		console.log(`Number is: ${total}`);
		runtimeVal.close();
	}
);
