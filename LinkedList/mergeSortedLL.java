/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    
    Node newhead1=null;
    
    if(headA==null)
        return headB;
    if(headB==null){
        return headA;
    }
    
    //System.out.println(headA.data);
    //    System.out.println(headB.data);
    
    if(headA.data<=headB.data){
     newhead1=headA;   
        headA=headA.next;
    }
    else{
        newhead1=headB;
        headB=headB.next;
    }
    Node newhead=newhead1;
    
        //System.out.println(newhead.data);
    
    while(headA!=null && headB!=null){
        
        if(headA.data<=headB.data){
            newhead.next=headA;
            headA=headA.next;
            
        }
        else{
            newhead.next=headB;
            headB=headB.next;
        }
        newhead=newhead.next;
       //System.out.println(newhead.data);
     }
    
    if(headA==null){
        newhead.next=headB;
    }
    if(headB==null){
        newhead.next=headA;
    }
    
    return newhead1;
    

}
