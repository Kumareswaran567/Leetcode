/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        int count = 0;
        while(temp!=null && temp.next!=null){
            ListNode first = temp;
            ListNode second = temp.next;
            ListNode after = second.next;
            
            second.next = first;
            first.next = after;
            if(count==0){
                head = second;
                count++;
            }else{
                prev.next = second;
            }
            prev = first;
            temp = after;
        }
        return head;
    }
}