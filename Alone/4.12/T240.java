public class T240 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/12 14:44
     * @Param [int[][], int]
     * @return boolean
     **/
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = n - 1;
        while (l < m && r >= 0) {
            if(target == matrix[l][r])
                return true;
            else if(target < matrix[l][r])
                r--;
            else if(target > matrix[l][r])
                l++;
        }
        return false;
    }
}