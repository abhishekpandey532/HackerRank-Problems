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
    
    int length=0;
    Node temp=head;
    Node head1=head;
    
    Node nnode=new Node();
    nnode.data=data;
    nnode.next=null;
    
    while(head1!=null){
        length++;
        head1=head1.next;
        temp=temp.next;
    }
    
    if(head==null){
        head=nnode;
        
    }
    else if(position==0){
        nnode.next=head;
        head=nnode;
    }
    else if(position==length){
        temp.next=nnode;
    }

    else{
        int pos=0;
        Node temp1=head;
        while(temp1!=null){
            pos++;
            if(position==pos){
                break;
            }
            temp1=temp1.next;
        }
        Node temp2=temp1.next;
        
        nnode.next=temp2;
        temp1.next=nnode;
        
        
        
        
        
        
    }
    
    return head;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
