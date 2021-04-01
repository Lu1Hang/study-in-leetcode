import java.util.Arrays;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-01 10:06
 * @Description:
 */
public class T455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0, gi = g.length - 1, si = s.length - 1;
        while (gi >= 0 && si >= 0){
            if(g[gi] > s[si])
                gi --;
            else {
                res ++;
                gi --;
                si --;
            }
        }
        return res;
    }
}
