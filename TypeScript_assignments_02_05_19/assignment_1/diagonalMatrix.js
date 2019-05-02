var matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
function printDiagonal(matrix) {
    for (var i = 0; i < matrix.length; ++i) {
        for (var j = matrix.length - 1; j >= 0; --j) {
            if (i + j == matrix.length - 1) {
                console.log("Matrix Diagonal " + matrix[i][j]);
            }
        }
    }
}
