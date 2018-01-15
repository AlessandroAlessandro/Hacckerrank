/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node curr = head; // hold current node start at head
   int count = 0;
    while (curr.next != null) // traverse until end
   {
    if (position == 0){   // case of head deletion
        head = head.next;
        return head;
    }
    if (count == position-1) // all other cases deletion
    {
     curr.next = curr.next.next;
     return head;
    }
    count++;
    curr = curr.next;
       
   }
   return head;
}

   // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node curr = head; // hold current node start at head
   int count = 0;
    while (curr.next != null) // traverse until end
   {
    if (position == 0){   // case of head deletion
        head = head.next;
        return head;
    }
    if (count == position-1) // all other cases deletion
    {
     curr.next = curr.next.next;
     return head;
    }
    count++;
    curr = curr.next;
       
   }
   return head;
}


