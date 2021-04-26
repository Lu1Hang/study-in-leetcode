import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-26 12:25
 * @Description: 需要二刷
 */
public class T239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue q = new MyQueue();
        int[] res = new int[nums.length - k + 1];
        int p = 0;
        //放入前k个元素
        for (int i = 0; i < k; i++) {
            q.push(nums[i]);
        }
        res[p++] = q.getMax();
        //移动滑动窗口
        for (int i = k; i < nums.length; i++) {
            q.pop(nums[i - k]);
            q.push(nums[i]);
            res[p++] = q.getMax();
        }
        return res;
    }

    private class MyQueue {

        //维护的单调队列，队列最大值在队首
        private Deque<Integer> queue = new ArrayDeque<>();

        //如果push的数值大于入口元素的数值，那么就将队列后端的数值弹出，直到push的数值小于等于队列入口元素的数值为止。
        public void push(int num) {
            while (!queue.isEmpty() && num > queue.getLast()) {
                queue.pollLast();
            }
            queue.addLast(num);
        }

        //出队
        public void pop(int num) {
            if(!queue.isEmpty() && num == queue.getFirst())
                queue.pollFirst();
        }

        //得到队列里的最大值
        public int getMax() {
            return queue.getFirst();
        }
    }

    public static void main(String[] args) {
        T239 t239 = new T239();
        System.out.println(t239.maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3));
    }
}
