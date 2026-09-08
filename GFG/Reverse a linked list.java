/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node temp1 = null;
        Node temp2 = null;
        
        while(head!=null){
            temp2=head.next;
            head.next=temp1;
            temp1=head;
            head=temp2;
        }
        head = temp1;
        return head;
    }
}