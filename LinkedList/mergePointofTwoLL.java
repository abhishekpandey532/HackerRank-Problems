/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    
    Node p,q;
    p=headA;
    q=headB;
    
    int len1=0,len2=0,d=0;
    while(p!=null){
        len1++;
        p=p.next;
    }
    while(q!=null){
        len2++;
        q=q.next;
    }
    p=headA;
    q=headB;
    if(len1>=len2){
        d=len1-len2;
        while(d>0){
          p=p.next;
            d--;
        }
        
        
    }
    else{
        d=len2-len1;
        while(d>0){
          q=q.next;
            d--;
        }
        
        
    }
    
    int fval;
    while(true){
        if(p==q){
            fval=p.data;
            break;
        }
        p=p.next;
        q=q.next;
    }
    
    return fval;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
