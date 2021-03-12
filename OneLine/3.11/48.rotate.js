/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    var n = matrix.length;
    for (let i=0;i<n/2;i++)
    {
        for (let j=0;j<n;j++)
            [matrix[i][j],matrix[n-i-1][j]]=[matrix[n-i-1][j],matrix[i][j]];
    }
    for (let i=0;i<n;i++)
    {
        for (let j=0;j<i;j++)
        [matrix[j][i],matrix[i][j]]=[matrix[i][j],matrix[j][i]];
    }
    return matrix;
};
