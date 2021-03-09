/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-09 09:31
 * @Description:
 */
public class T134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int minGas = Integer.MAX_VALUE;
        int minIndex = 0;
        int gasAmount = 0;
        for (int i = 0; i < gas.length; i++) {
            gasAmount += (gas[i] - cost[i]);
            if(gasAmount < minGas){
                minIndex = i;
                minGas = gasAmount;
            }
        }
        return gasAmount < 0 ? -1 : (minIndex + 1) % gas.length;
    }

    public static void main(String[] args) {
        T134 t134 = new T134();
        System.out.println(t134.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }
}
