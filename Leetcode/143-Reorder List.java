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
    public void reorderList(ListNode head) {
        //edge case
        if(head == null || head.next == null){
            return;
        }
        //for middle
        ListNode mid = head;
        ListNode temp = head;
        while(temp.next != null && temp.next.next != null){
            mid = mid.next;
            temp = temp.next.next;
        }
        //for half reverse
        temp = mid.next;
        mid.next = null;
        
        ListNode temp2 = null;
        ListNode temp3 = null;
        while(temp != null){
            temp2 = temp.next;
            temp.next = temp3;
            temp3 = temp;
            temp = temp2;
        }
        //merge list
        ListNode first = head;
        ListNode second = temp3;

        while(second != null){
            ListNode n1 = first.next;
            ListNode n2 = second.next;
            first.next = second;
            second.next = n1;
            first = n1;
            second = n2;
        }
        return;
    }
}