/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-21 12:33
 * @Description:
 */
public class T59 {

    private int number;

    public int[][] generateMatrix(int n) {
        number = 1;
        int[][] result = new int[n][n];
        int x = 0, r = n;
        for (; r > 0; r -= 2){
            fillMatrix(result, r, x, x);
            x++;
        }
        return result;
    }

    public void fillMatrix(int[][] matrix, int r, int x, int y) {
        int xx = x + r - 1, yy = y + r - 1;
        for (int i = x; i <= xx; i++) {
            matrix[x][i] = number++;
        }
        for (int i = y + 1; i <= yy; i++) {
            matrix[i][xx] = number++;
        }
        for (int i = yy - 1; i >= x; i--) {
            matrix[xx][i] = number++;
        }
        for (int i = xx - 1; i > x; i--) {
            matrix[i][x] = number++;
        }
    }

    public static void main(String[] args) {
        T59 t59 = new T59();
        System.out.println(t59.generateMatrix(3));
    }
}
