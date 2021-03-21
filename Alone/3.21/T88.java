/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @Description:
 */
public class T88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r = m + n - 1, p1 = m - 1, p2 = n - 1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[r] = nums1[p1];
                p1 --;
            } else {
                nums1[r] = nums2[p2];
                p2 --;
            }
            r --;
        }
        for (int i = 0; i <= p2; i++) {
            nums1[i] = nums2[i];
        }
        return;
    }
}
