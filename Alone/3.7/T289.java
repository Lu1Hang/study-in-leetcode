/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-07 11:04
 * @Description:
 */
public class T289 {

    /**
     * 矩阵问题通用解法:
     * 1.矩阵中某个位置的状态如果发生改变，那么这种题的解法一般是两次遍历整个矩阵。
     * 2.如果遍历到某个位置时，需要查看它周边的位置，可以先用一个数组保存向周边位置变化的坐标偏移值
     * 该题中有4种状态:
     * 1> 死->死
     * 2> 活->死
     * 3> 死->活
     * 4> 活->活
     */

    int[][] dir = new int[][]{{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(isAlive(board, i, j)){
                    board[i][j] += 2;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 0 || board[i][j] == 1)
                    board[i][j] = 0;
                else board[i][j] = 1;
            }
        }
    }

    public boolean isAlive(int[][] board, int x, int y) {
        int co = 0;
        for (int i = 0; i < dir.length; i++) {
            int nextx = x + dir[i][0];
            int nexty = y + dir[i][1];
            if(nextx >= 0 && nextx < board.length && nexty >= 0 && nexty < board[0].length && (board[nextx][nexty] & 1) == 1)
                co ++;
        }
        if(board[x][y] == 0)
            return co == 3 ? true : false;
        else
            return co == 2 || co == 3 ? true : false;
    }
}
