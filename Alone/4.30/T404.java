public class T404 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/30 12:13
     * @Param [TreeNode]
     * @return int
     **/
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        return getResult(root, false);
    }

    public int getResult(TreeNode root, boolean flag) {
        if(root == null)
            return 0;
        if(flag && root.left == null && root.right == null)
            return root.val;
        int left = getResult(root.left, true);
        int right = getResult(root.right, false);
        return left + right;
    }
}