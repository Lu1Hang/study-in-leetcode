public class T110 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/29 16:03
     * @Param [TreeNode]
     * @return boolean
     **/
    public boolean isBalanced(TreeNode root) {
        if(judge(root) == -1)
            return false;
        else
            return true;
    }

    public int judge(TreeNode root) {
        if(root == null)
            return 0;
        int left = judge(root.left);
        if(left == -1)
            return -1;
        int right = judge(root.right);
        if(right == -1)
            return -1;
        return Math.abs(left - right) <= 1 ? Math.max(left, right) + 1 : -1;
    }
}