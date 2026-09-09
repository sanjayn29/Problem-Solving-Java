/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void reorderList(Node head) {
        // code here
        if(head == null || head.next == null){
                    return;
                }
                
                //for middle
                Node mid = head;
                Node temp = head;
                while(temp.next != null && temp.next.next != null){
                    mid = mid.next;
                    temp = temp.next.next;
                }
                
                //for half reverse
                temp = mid.next;
                mid.next = null;

                Node temp2 = null;
                Node temp3 = null;
                while(temp != null){
                    temp2 = temp.next;
                    temp.next = temp3;
                    temp3 = temp;
                    temp = temp2;
                }
                
                //merge list
                Node first = head;
                Node second = temp3;

                while(second != null){
                    Node n1 = first.next;
                    Node n2 = second.next;
                    first.next = second;
                    second.next = n1;
                    first = n1;
                    second = n2;
                }
                return;
    }
}