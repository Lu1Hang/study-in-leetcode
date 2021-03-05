/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-05 09:17
 * @Description:
 */
public class T240 {

    /**
     * 考虑从左下角或右上角出发
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = matrix.length - 1, r = 0;
        while (l >= 0 && r < matrix[0].length) {
            if(target < matrix[l][r])
                l --;
            else if(target > matrix[l][r])
                r ++;
            else return true;
        }
        return false;
    }
}
