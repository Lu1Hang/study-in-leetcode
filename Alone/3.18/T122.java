
/**
 * @BelongsProject: review
 * @BelongsPackage: com.interview.leetcode
 * @Author: Alone
 * @CreateTime: 2021-03-18 20:21
 * @Description:
 */
public class T122 {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int head = 0, tail = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] >= prices[tail])
                tail ++;
            else{
                maxPrice = maxPrice + prices[tail] - prices[head];
                head = i;
                tail = i;
            }
        }
        maxPrice += Math.max((prices[tail] - prices[head]), 0);
        return maxPrice;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{6,1,3,2,4,7};
        T122 t122 = new T122();
        System.out.println(t122.maxProfit(prices));
    }
}
