/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-02 08:37
 * @Description:
 */
public class T338 {

    /**
     * 奇数i比偶数i-1多一个1
     * 偶数i等于偶数i>>1的1的个数
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        int[] results = new int[num + 1];
        results[0] = 0;
        if(num == 0)
            return results;
        results[1] = 1;
        if(num == 1)
            return results;
        for (int i = 2; i < results.length; i++) {
            if((i & 1) == 1)
                results[i] = results[i - 1] + 1;
            else
                results[i] = results[i >> 1];
        }
        return results;
    }

    public static void main(String[] args) {
        T338 t338 = new T338();
        System.out.println(t338.countBits(2));
    }
}
