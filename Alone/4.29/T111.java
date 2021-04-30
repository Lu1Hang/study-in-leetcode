public class T111 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/29 10:45
     * @Param [TreeNode]
     * @return int
     **/
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0) return left + right + 1;//不是叶子节点
        return Math.min(left, right) + 1;
    }
}