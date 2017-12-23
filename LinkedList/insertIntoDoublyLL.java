/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    
    Node n=new Node();
    n.data=data;
    n.prev=null;
    n.next=null;
    Node p=head;
    Node q=null;
    if(head==null){
        head=n;
        n.prev=head;
    }
    else{
        q=null;
        while(n.data>=p.data){
            q=p;
            p=p.next;
            if(p==null)
                break;
        }
        if(q==null){
            head=n;
            n.prev=head;
            n.next=p;
        }
        if(p==null){
            q.next=n;
            n.prev=q;
        }
        else{
            n.next=q.next;
            n.prev=p.prev;
            q.next=n;
            p.prev=n;
            
            
            
        }
        
    }
           return head;
 
  
}
