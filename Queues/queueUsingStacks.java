import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
        
        Stack<Integer> s=new Stack<Integer>();
        
        Stack<Integer> s1=new Stack<Integer>();
        
        
        int q,n,q1,q2,q3;
        q=sc.nextInt();
        
        
        while(q!=0){
        
            q1=sc.nextInt();
            
            if(q1==1){
                s.push(sc.nextInt());   
            }
            if(q1==2){
                if(!s1.isEmpty())
                    s1.pop();
               
                else{
                    while(!s.isEmpty())
                        s1.push(s.pop());
                        
                    s1.pop();
                }
            }
            if(q1==3){
                if(!s1.isEmpty())
                System.out.println(s1.peek());
                else{
                    while(!s.isEmpty())
                    s1.push(s.pop());
                    
                    
                    System.out.println(s1.peek());
                }
                
                
                
            }
                
        
            
            
            
        --q;    
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}