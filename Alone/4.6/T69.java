/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-06 13:53
 * @Description:
 */
public class T69 {

    public int mySqrt(int x) {
        int l = 0, r = x;
        while (l <= r){
            int mid = l + (r - l) / 2;
            int sqrt = x / mid;
            if(sqrt < mid)
                r = mid - 1;
            else if(sqrt > mid)
                l = mid + 1;
            else
                return mid;
        }
        return r;
    }

    public static void main(String[] args) {
        T69 t69 = new T69();
        System.out.println(t69.mySqrt(8));
    }
}
