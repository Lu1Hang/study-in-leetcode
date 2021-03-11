import java.util.Stack;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-11 08:19
 * @Description:
 */
public class T230 {

    /**
     * 二叉搜索树的定义：
     * 1.若任意节点的左子树不空，则左子树上所有节点的值均小于它的根节点的值；
     * 2.若任意节点的右子树不空，则右子树上所有节点的值均大于它的根节点的值
     * 3.任意节点的左、右子树也分别为二叉查找树
     * 4.没有键值相等的节点
     */

    /**
     * 递归解法
     */
//    private int num;
//
//    private int result;
//
//    public int kthSmallest(TreeNode root, int k) {
//        inorder(root, k);
//        return result;
//    }
//
//    public void inorder(TreeNode root, int k) {
//        if(root == null)
//            return;
//        inorder(root.left, k);
//        num ++;
//        if(num == k){
//            result = root.val;
//            return;
//        }
//        inorder(root.right, k);
//    }

    /**
     * 递推写法
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> s = new Stack<>();
        int num = 0, res = 0;
        TreeNode cur = root;
        while (cur != null || !s.empty()){
            while (cur != null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            num ++;
            if(num == k){
                res = cur.val;
                break;
            }
            cur = cur.right;
        }
        return res;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
