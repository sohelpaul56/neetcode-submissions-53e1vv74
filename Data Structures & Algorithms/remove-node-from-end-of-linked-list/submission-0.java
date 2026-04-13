class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    int count=0;
    ListNode temp=head;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    if(count==n) return head.next;
    ListNode res=head;
    for (int i = 1; i < count - n; i++) {
    res = res.next;
    }
    res.next=res.next.next;
    return head;
    }
}
