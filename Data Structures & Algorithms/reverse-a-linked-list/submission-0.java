class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode temp=head;
        ListNode curr=temp;
        ListNode prev=null;
        ListNode nxt=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=nxt;
            if(nxt!=null){
            nxt=nxt.next; 
        }
        }
        return prev;
    }
}
