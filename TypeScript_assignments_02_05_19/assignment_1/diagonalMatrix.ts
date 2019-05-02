let matrix: number[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];

function printDiagonal(matrix:number[])	{
	for(let i: number=0; i<matrix.length; ++i)	{
		for(let j: number = matrix.length-1 ; j>=0; --j)	{
			if(i+j == matrix.length-1)	{
				console.log(`Matrix Diagonal ${matrix[i][j]}`);
			}
		}
	}
}
