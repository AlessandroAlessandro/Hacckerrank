/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node newNode = new Node();
    Node newHead = newNode;
    Node curr = head;
    if (head == null){
        
        newNode.data = data;
        newNode.next = null;
        head = newNode;
        return head;
    }
    else
    {
    while (curr.next != null){
        curr = curr.next;
    }
    curr.next = newNode;
        newNode.data= data;
    newNode.next = null;
    }
    return head;
}
