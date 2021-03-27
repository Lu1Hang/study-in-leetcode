/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-27 13:49
 * @Description:
 */
public class T572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t == null)
            return true;
        if(s == null)
            return false;
        return isSubtree(s.left, t) || isSubtree(s.right, t) || isSameTree(s, t);
    }

    public boolean isSameTree(TreeNode s, TreeNode t) {
        if(s == null && t == null) return true;
        if((s == null && t != null) || (s != null && t == null)) return false;
        if(s.val != t.val) {
            return false;
        }
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
