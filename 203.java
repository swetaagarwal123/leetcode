class Solution {
    public ListNode removeElements(ListNode head, int val) {
         ListNode x=head;
        ListNode it=x;
        while(x!=null && x.val==val){
            head=x.next;
            x=head;
        }
        while(x!=null){
            if(x.val==val){
               
                it.next=x.next;
                x=it.next;
            }
            else{
                it=x;
                x=x.next;
            }
            
        }
        
        return head;
        
    }
}
