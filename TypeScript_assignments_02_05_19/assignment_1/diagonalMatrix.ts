let matrix:number[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];

function printDiagonal(matrix:number[])	{
	for(i in matrix)	{
		for(let j: number=0; j<i.length; ++j)	{
			if(i == j-i)	{
				console.log(`Matrix Diagonal ${matrix[i][j]}`);
			}
		}
	}
}
