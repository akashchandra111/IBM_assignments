function print100Total(): number	{
	let total: number = 0;
	for(let i: number=1; i<=100; ++i)	total += i;
	return total;
}

console.log(print100Total());
