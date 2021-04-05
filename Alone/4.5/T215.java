import java.util.PriorityQueue;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-05 13:21
 * @Description:
 */
public class T215 {


//    public int findKthLargest(int[] nums, int k) {
//        //最小堆
//        int len = nums.length;
//        PriorityQueue<Integer> queue = new PriorityQueue<>(k + 1, (a, b) -> (a - b));
//        for (int i = 0; i < k; i++) {
//            queue.add(nums[i]);
//        }
//        for (int i = k; i < nums.length; i++) {
//            queue.add(nums[i]);
//            queue.poll();
//        }
//        return queue.peek();
//    }

    public int findKthLargest(int[] nums, int k) {
        //最大堆
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (a, b) -> (b - a));
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }
        return queue.peek();
    }
}
