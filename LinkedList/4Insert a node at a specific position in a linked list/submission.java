/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
     Node newNode = new Node();
    if (head == null) // empty set
    {
        newNode.data = data;
        newNode.next = null;
        return newNode;
    }
    int i =0;
    Node curr = head;
    if (position == 0){
        newNode.data = data;
        newNode.next = head;
        return newNode;
        
    }
    while( curr != null)
    {
        
        if (i == position -1){
            newNode.next = curr.next;
            curr.next = newNode;
            newNode.data = data;
          
        }   
        i++;
        
        curr = curr.next;
        
        
    }
   return head; 
}
