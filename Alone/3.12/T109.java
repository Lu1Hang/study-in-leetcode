/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-12 20:50
 * @Description:
 */
public class T109 {

    /**
     * 二叉搜索树的中序遍历是升序排序的
     * @param head
     * @return
     */
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        else if(head.next == null)
            return new TreeNode(head.val);
        //找到链表的中间节点
        ListNode fast = head, slow = head, pre = null;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        //分割左右链表
        pre.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
