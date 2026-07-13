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
    public ListNode deleteMiddle(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        int mid = n/2;
        ListNode node = null;
        ListNode comp = head;
        ListNode tail = null;
        int count = 0;
        while(comp!=null){
            if(count!=mid){
                ListNode newnode = new ListNode(comp.val);
                if(node==null){
                    node = newnode;
                    tail = newnode;
                }else{
                    tail.next = newnode;
                    tail = newnode;
                }
            }
            count++;
            comp = comp.next;
        }
        return node;
    }
}