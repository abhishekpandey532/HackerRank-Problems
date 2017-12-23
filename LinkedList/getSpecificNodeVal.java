/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    
    Node temp=head;
    int length=0;
    
    while(temp!=null){
        length++;
        temp=temp.next;
    }
    int pos=length-n-1;
    int count=0;
    
    temp=head;
    
    
    while(true){
        if(count==pos){
            return temp.data;
        }
        count++;
        temp=temp.next;
    }
    
}
