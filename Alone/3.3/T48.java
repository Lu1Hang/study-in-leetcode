/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-03 08:32
 * @Description:
 */
public class T48 {

    public void rotate(int[][] matrix) {
        int square = matrix.length;
        int pos1 = 0, pos2 = matrix.length - 1;
        while (square > 0){
            for (int i = 0; i < square - 1; i++) {
                //取出0
                int tmp = matrix[pos1][pos1 + i];
                //3 -> 0
                matrix[pos1][pos1 + i] = matrix[pos2 - i][pos1];
                //2 -> 3
                matrix[pos2 - i][pos1] = matrix[pos2][pos2 - i];
                //1 -> 2
                matrix[pos2][pos2 - i] = matrix[pos1 + i][pos2];
                //0 -> 1
                matrix[pos1 + i][pos2] = tmp;
            }
            square -= 2;
            pos1 ++;
            pos2 --;
        }
    }

    public static void main(String[] args) {
        T48 t48 = new T48();
        t48.rotate(new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}});
    }
}
