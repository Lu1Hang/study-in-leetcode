import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-27 19:35
 * @Description:
 */
public class T144 {

    private List<Integer> res = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return res;
    }

    public void preOrder(TreeNode root) {
        if(root == null)
            return;
        res.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
