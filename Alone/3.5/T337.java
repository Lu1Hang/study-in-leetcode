/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-05 09:29
 * @Description:
 */
public class T337 {

    /**
     * 树形dp
     * dp[node][0]为偷取该结点,dp[node][1]为不偷该结点
     * @param root
     * @return
     */
    public int rob(TreeNode root) {
        if(root == null)
            return 0;
        int[] dp = dp(root);
        return Math.max(dp[0], dp[1]);
    }

    private int[] dp(TreeNode root) {
        //返回条件
        if(root == null)
            return new int[]{0, 0};
        int[] left = dp(root.left);
        int[] right = dp(root.right);
        int[] now = new int[2];
        now[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        now[1] = root.val + left[0] + right[0];
        return now;
    }

    class TreeNode {
        int val;
        T337.TreeNode left;
        T337.TreeNode right;
        TreeNode(){}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, T337.TreeNode left, T337.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
