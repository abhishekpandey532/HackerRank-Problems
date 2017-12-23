import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static class Multiple{
        int data;
        int max;
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       
        // your code goes here
        
        Scanner s=new Scanner(System.in);
        
        int q,n;
        int q1,q2,q3;
        int max=Integer.MIN_VALUE;
        
        q=s.nextInt();
        
        Stack<Multiple> sc=new Stack<Multiple>();
        
        /*Multiple m=new Multiple();
        m.data=10;
        m.max=100;
        
        sc.push(m);
        
        
        sc.pop();
        System.out.println("Max data is: "+sc.peek().data);
        */
        
        
        
        
        while(q!=0){
            
        //System.out.println("Q values is: "+q);
            
        q1=s.nextInt();
        
        if(q1==1){
          n=s.nextInt();
         
          if(n>max)
             max=n;
         
         Multiple m=new Multiple();
         m.data=n;
         m.max=max;
         
         sc.push(m);
          
          
        }
        if(q1==2){
        //System.out.println("In q2");
         sc.pop();
         
         if(!sc.isEmpty()){
             max=sc.peek().max; 
         }
         else if(sc.isEmpty())
             max=Integer.MIN_VALUE;
        }
        
        if(q1==3){
            System.out.println(sc.peek().max);
        }
        
        
        //System.out.println("Just Before");
        //System.out.println("Stack top is: "+sc.peek().data);
        //System.out.println("Max Stack top is: "+sc.peek().max);
        
            
            
            
        --q;    
            
            
            
        }
        
        
        
        
    }
}