/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node curr,next;
    curr=head;
    next=curr.next;
    int flag=0;
    while(true){
        if(next==null)
            break;
        while(next.data==curr.data){
            next=next.next;
            if(next==null){
                flag=1;
                break;
            }
        }
        curr.next=next;
        if(flag==1)
            break;
        
        curr=next;
        next=curr.next;
    }
    return head;
    
    
    
    
    

}
