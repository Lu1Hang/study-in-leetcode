/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-20 11:09
 * @Description:
 */
public class T142 {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){//不能最开始就判断
                ListNode p1 = head, p2 = fast;
                while (p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p2;
            }
        }
        return null;
    }
}
