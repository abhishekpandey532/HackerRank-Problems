/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    
    Node tempA=headA;
    Node tempB=headB;
    int ans=1;
    int lenA=0;
    int lenB=0;
    
    while(tempA!=null){
        lenA++;
        tempA=tempA.next;
        
    }
    while(tempB!=null){
        lenB++;
        tempB=tempB.next;
    }
    if(lenA!=lenB)
        return 0;
    
    else{
        tempA=headA;
        tempB=headB;
        ans=1;
        while(tempA!=null){
            if(tempA.data!=tempB.data){
                ans=0;
                break;
            }
            
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return ans;
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
}
