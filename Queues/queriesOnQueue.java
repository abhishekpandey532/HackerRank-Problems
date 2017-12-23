import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int n,i,j,k;
    int q;
    int d;
    ArrayList<Integer> al=new ArrayList<>();

    n=sc.nextInt();
    q=sc.nextInt();
    
    for(i=0;i<n;i++){
        al.add(sc.nextInt());
    }
    ArrayList<Integer> sol=new ArrayList<>();

    for(i=0;i<q;i++){
        d=sc.nextInt();
        Deque<Integer> deq = new ArrayDeque<Integer>(d);
        sol.clear();
        //deq.addLast(0);
        for(k=0;k<d;k++){
            //System.out.println(deq);
            //System.out.println(deq.getLast());
      
            while(!deq.isEmpty() && al.get(k)>al.get(deq.getLast()))
                deq.removeLast();
            
            deq.addLast(k);
            
        }
        sol.add(al.get(deq.getFirst()));
    
        //System.out.println(deq);
        for(k=d;k<n;k++){
            //System.out.println(al.get(deq.getFirst()));
           
            
            while(!deq.isEmpty() && deq.getFirst()<=(k-d))
                deq.removeFirst();
            
            while(!deq.isEmpty() && al.get(k)>al.get(deq.getLast()))
                deq.removeLast();
            
            deq.addLast(k);
                        
            sol.add(al.get(deq.getFirst()));

            
            //if(al.get(k)<al.get(deq.getLast()))
            //  deq.addLast(k);
        }
        
        
        System.out.println(Collections.min(sol));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
       
    
    }
}