/**
 * @param {number[][]} grid
 * @return {number}
 */
var shortestPathBinaryMatrix = function(grid) {
    const dirs = [[-1,0],[1,0],[0,1],[0,-1],[1,1],[1,-1],[-1,1],[-1,-1]];
    if (grid[0][0]) return -1;
    const row = grid.length-1,col = grid[0].length-1;
    if (grid[row][col]) return -1;
    const queue = [[0,0]];
     grid[0][0] = 1;
    let res = 0, i = queue.length, newX, newY, temp, x, y;
   
    while (i){
        res++;
        while (i--)
        {
            temp = queue.shift();
            //shift()把数组第一个元素删除并返回第一个元素的值
            if (temp[0] === row && temp[1] === col)return res;
            dirs.forEach(dir =>{
                newX = temp[0]+dir[0];
                newY = temp[1]+dir[1];
                if (newX<0 || newX>row || newY<0 || newY>col || grid[newX][newY])return ;
                queue.push([newX,newY]);
                grid[newX][newY] =1;
            })
        }
        i = queue.length;
    }
       
    return -1;
};
