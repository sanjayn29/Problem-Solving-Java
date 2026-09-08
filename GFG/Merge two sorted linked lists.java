/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        
        Node temp = null;
        Node head = null;
        Node tail = null;
        
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp = new Node(head1.data);
                head1 = head1.next;
            }else{
                temp = new Node(head2.data);
                head2 = head2.next;
            }
            
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        if(head1 == null){
            tail.next = head2;
        }
        if(head2 == null){
            tail.next = head1;
        }
        return head;
        
    }
}