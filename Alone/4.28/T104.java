public class T104 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/28 12:48
     * @Param [TreeNode]
     * @return int
     **/
    public int maxDepth(TreeNode root) {
        return getDepth(root);
    }

    private int getDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return Math.max(left, right) + 1;
    }
}