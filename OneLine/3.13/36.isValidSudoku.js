/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {
    var row = new Array;
    var col = new Array;
    var box = new Array;
    for (let i=0;i<9;i++)
    {
        row[i] = new Array(10);
        col[i] = new Array(10);
        box[i] = new Array(10); 
    }
    for (let i=0;i<9;i++)
    {
        for (let j=0;j<9;j++)
        {
            if (board[i][j]=='.')continue;
       
        let num = parseInt(board[i][j]);
        if (row[i][num])return false;
        if (col[j][num])return false;
        let k = Math.floor(j/3) + Math.floor(i/3)*3;
        if (box[k][num])return false;
        row[i][num] = 1;
        col[j][num] = 1;
        box[k][num] = 1;
        }
    } 
    return true;
};




