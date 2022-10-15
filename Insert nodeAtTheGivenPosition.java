/*
Problem Statement
Given a linked list consisting of N nodes and two integers M and K. Your task is to add element K at the Mth position from the start of the linked list
*/

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node addElement(Node head, int k ,int pos ) {
//enter your code here
    Node newNode=new Node(k);
    if(pos==1){
        newNode.next=head;
        head=newNode;
    }
    else{
        int i=1;
        Node prev=head;
        while(i!=pos-1){
            prev=prev.next;
            i++;
        }
        newNode.next=prev.next;
        prev.next=newNode;
    }
    return head;

}