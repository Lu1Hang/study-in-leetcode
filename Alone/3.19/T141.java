/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @Description:
 */
public class T141 {

    /**
     * 快慢指针
     * 快指针每次走2步，慢指针每次走1步,时间复杂度O(n+k)
     * 还可以用哈希表做,时间复杂度O(n),空间复杂度O(n)
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode low = head;
        ListNode fast = head.next;
        while(!low.equals(fast)){
            if(fast.next != null && fast.next.next != null){
                low = low.next;
                fast = fast.next.next;
            } else {
                return false;
            }
        }
        return true;
    }
}
