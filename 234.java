class Solution {
    public boolean isPalindrome(ListNode head) {
         if (head == null || head.next == null) return true;

        ListNode reversed = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = reversed;
            reversed = slow;
            slow = next;
        }
        while (reversed != null) {
            if (head.val != reversed.val) return false;
            head = head.next;
            reversed = reversed.next;
        }

        return true;
        
        
    }
}
