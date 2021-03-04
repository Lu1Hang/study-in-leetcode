/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-04 09:17
 * @Description:
 */
public class T79 {

    private int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private boolean[][] visited;
    private char[][] board;
    private char[] words;
    private int row, col;

    public boolean exist(char[][] board, String word) {
        this.words = word.toCharArray();
        this.row = board.length;
        this.col = board[0].length;
        this.visited = new boolean[row][col];
        this.board = board;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(dfs(i, j, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(int x, int y, int now) {
        //返回条件
        if(now == words.length - 1) {
            return board[x][y] == words[now];
        }
        if(this.board[x][y] == words[now]){
            visited[x][y] = true;
            for (int i = 0; i < dir.length; i++) {
                int nextx = x + dir[i][0];
                int nexty = y + dir[i][1];
                if(nextx >= 0 && nextx < this.row && nexty >= 0 && nexty < this.col && !visited[nextx][nexty]){
                    if(dfs(nextx, nexty, now + 1)){
                        return true;
                    }
                }
            }
            visited[x][y] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        T79 t79 = new T79();
        System.out.println(t79.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));
    }
}
