/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {
    var row = matrix.length,column = matrix[0].length;
    let flag0 = false;
    for (let i=0;i<row;i++)
    {
        if (matrix[i][0]===0) flag0 = true;
        for (let j=1;j<column;j++)
        {
            if (matrix[i][j]===0) matrix[i][0]=matrix[0][j]=0;
        }
    }
    for (let i=row-1 ;i>=0 ; i--){
        for (let j=column-1;j>0 ;j--){
            if (matrix[i][0]==0 || matrix[0][j]==0)
            matrix[i][j]=0;
        }
        if (flag0)matrix[i][0]=0;
    }
};
