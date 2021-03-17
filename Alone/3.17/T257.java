import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-17 16:02
 * @Description:
 */
public class T257 {

    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return result;
        dfs(root, "");
        return result;
    }

    public void dfs(TreeNode root, String s){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            result.add(s + root.val);
            return;
        }
        dfs(root.left, s + root.val + "->");
        dfs(root.right, s + root.val + "->");
    }
}
