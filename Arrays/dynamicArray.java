/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        
        
        Scanner sc=new Scanner(System.in);
        int n,q;
        int q1,q2,q3;
        int la=0;
        int pos=-1;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
         
         n=sc.nextInt();
         
         for(int i=0;i<n;i++){
           al.add(new ArrayList<Integer>());
         }
         
         q=sc.nextInt();
         //System.out.println(q);
         
         for(int i=0;i<q;i++){
           
           //q2=sc.nextLine();
           q1=sc.nextInt();
           q2=sc.nextInt();
           q3=sc.nextInt();
           
           //System.out.println("Q1 is: "+q1);
           
           
           pos=(q2^la)%n;
           
           if(q1==1){
              al.get(pos).add(q3);  
              //ArrayList<Integer> curr=al.get(pos);
               //curr.add(q3);        
           }
           else if(q1==2){
             ArrayList<Integer> curr=al.get(pos);
                     la=(curr.get(q3%(curr.size())));
                     System.out.println(la);
           }
           
           
           
        
    
            
         
            
        }
         
        
        
        
        
        
        
    }
}