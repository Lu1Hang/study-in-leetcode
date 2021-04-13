import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-13 11:23
 * @Description:
 */
public class T783 {

    /**
     * @Author Alone
     * @Description
     * @Date  2021/4/13 11:41
     * @Param [TreeNode]
     * @return int
     **/
    public int minDiffInBST(TreeNode root) {
        //主要理解二叉树非递归遍历
        int ans = Integer.MAX_VALUE;
        TreeNode prev = null;
        Deque<TreeNode> s = new ArrayDeque<>();
        while (root != null || !s.isEmpty()){
            while (root != null) {
                s.addLast(root);
                root = root.left;
            }
            root = s.pollLast();
            if(prev != null){
                ans = Math.min(ans, Math.abs(prev.val - root.val));
            }
            prev = root;
            root = root.right;
        }
        return ans;
    }
}
