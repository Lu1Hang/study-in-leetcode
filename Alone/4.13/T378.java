import java.util.PriorityQueue;

public class T378 {

    /**
     * @Author Alone
     * @Description 堆排序
     * @Date  2021/4/13 11:48
     * @Param [int[][], int]
     * @return int
     **/
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k + 1, (o1, o2) -> o2 - o1);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                queue.add(matrix[i][j]);
                if(queue.size() > k)
                    queue.poll();
            }
        }
        return queue.poll();
    }
}