/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-11 15:25
 * @Description:
 */
public class T566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if(r * c !=  m * n)
            return nums;
        int[][] result = new int[r][c];
        int x = 0, y = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(y == n){
                    x ++;
                    y = 0;
                }
                result[i][j] = nums[x][y++];
            }
        }
        return result;
    }
}
