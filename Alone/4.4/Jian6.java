/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-04 17:19
 * @Description:
 */
public class Jian6 {

    public int minNumberInRotateArray(int [] array) {
        int l = 0, r = array.length - 1, mid = 0, res = 0;
        while (l <= r && array[l] >= array[r]){
            mid = (l + r) >> 1;
            if(array[l] == array[r] && array[mid] == array[l]){
                res = array[l];
                for (int i = l; i <= r; i++) {
                    res = array[i] < res ? array[i] : res;
                }
                return res;
            }
            if(array[mid] >= array[l]){
                l = mid + 1;
            } else r = mid;
        }
        return array[l];
    }
}
