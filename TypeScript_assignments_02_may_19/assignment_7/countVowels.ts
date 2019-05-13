import * as readline from 'readline';

let runtimeVal = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

runtimeVal.question("Enter string to count all vowels repeatition: ",
	(answer)=>	{
		let counter_a: number = 0;
		let counter_e: number = 0;
		let counter_i: number = 0;
		let counter_o: number = 0;
		let counter_u: number = 0;
		for(let i: number=0; i<answer.length; ++i)	{
			if(answer[i] == 'a' || answer[i] == 'A')	++counter_a;
			else if(answer[i] == 'e' || answer[i] == 'E')	++counter_e;
			else if(answer[i] == 'i' || answer[i] == 'I')	++counter_i;
			else if(answer[i] == 'o' || answer[i] == 'O')	++counter_o;
			else if(answer[i] == 'u' || answer[i] == 'U')	++counter_u;
		}
		console.log(`
a occured: ${counter_a} times.
e occured: ${counter_e} times.
i occured: ${counter_i} times.
o occured: ${counter_o} times.
u occured: ${counter_u} times.
`);
		runtimeVal.close();
	}
);
