import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-27 13:31
 * @Description:
 */
public class T437 {

    public int pathSum(TreeNode root, int sum) {
        //定义一个map，key为前缀和，value为出现次数
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);
        int result = getResult(root, prefixSum, sum, 0);
        return result;
    }

    /**
     * 为什么不是target-currSum?
     * 因为是先计算到了currSum，再往前找比currSum小target的数
     */
    public int getResult(TreeNode root, Map<Integer, Integer> prefixSum, int target, int currSum) {
        //当节点为空时,返回0
        if(root == null)
            return 0;
        //给当前前缀和加上当前节点值
        int result = 0;//计算结果
        currSum += root.val;
        //找到当前和互补的数出现次数
        result += prefixSum.getOrDefault(currSum - target, 0);
        //将当前和加进去
        prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
        //递归处理下一层
        result += getResult(root.left, prefixSum, target, currSum);
        result += getResult(root.right, prefixSum, target, currSum);
        //将当前层的去掉
        prefixSum.put(currSum, prefixSum.get(currSum) - 1);
        return result;
    }
}
