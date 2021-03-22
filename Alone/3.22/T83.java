/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-22 17:01
 * @Description:
 */
public class T83 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode now = head;
        ListNode next = head.next;
        while (now != null && next != null){
            if(now.val == next.val){
                if(next.next != null){
                    next = next.next;
                    now.next = next;
                } else {
                    now.next = null;
                    break;
                }
            } else {
                if(next.next != null){
                    now = next;
                    next = next.next;
                } else {
                    break;
                }
            }
        }
        return head;
    }
}
