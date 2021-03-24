/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-24 13:31
 * @Description:
 */
public class T234 {

    public boolean isPalindrome(ListNode head) {
        //找到链表中点
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //切割链表
        ListNode behind = slow.next;
        slow.next = null;
        //反转后半部分链表
        ListNode pre = null, now = behind, next = null;
        while (now != null){
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        //比较两部分是否相等
        ListNode p1 = head, p2 = pre;
        while (p2 != null){
            if(p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        T234 t234 = new T234();
        System.out.println(t234.isPalindrome(node));
    }
}
