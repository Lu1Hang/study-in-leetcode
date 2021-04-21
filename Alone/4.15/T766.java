/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-15 15:06
 * @Description:
 */
public class T766 {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            if(!isChecked(matrix, matrix[0][i], 0, i))
                return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if(!isChecked(matrix, matrix[i][0], i, 0))
                return false;
        }
        return true;
    }

    public boolean isChecked(int[][] matrix, int expectedValue, int i, int j) {
        if(i >= matrix.length || j >= matrix[0].length)
            return true;
        if(matrix[i][j] != expectedValue)
            return false;
        return isChecked(matrix, expectedValue, i + 1, j + 1);
    }
}
