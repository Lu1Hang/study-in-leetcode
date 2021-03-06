import java.util.HashMap;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-06 16:25
 * @Description:
 */
public class T454 {

    /**
     * 分组相加
     * @param A
     * @param B
     * @param C
     * @param D
     * @return
     */
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(map.containsKey(A[i] + B[j]))
                    map.put(A[i] + B[j], map.get(A[i] + B[j]) + 1);
                else
                    map.put(A[i] + B[j], 1);
            }
        }

        for (int i : C) {
            for (int j : D) {
                int tmp = i + j;
                if(map.containsKey(-tmp))
                    result += map.get(-tmp);
            }
        }
        return result;
    }
}
