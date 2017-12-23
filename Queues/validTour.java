/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> petrol=new ArrayList<>();
        ArrayList<Integer> distance=new ArrayList<>();
        
        int n,i,j,k;
        n=sc.nextInt();
       for(i=0;i<n;i++)
       {
           petrol.add(sc.nextInt());
           distance.add(sc.nextInt());
       }
    
        int start=0;
        int end=1;
        int curr=petrol.get(start)-distance.get(start);
        
        //System.out.println(curr);
       while(end!=start || curr<0)
       {
        while(curr<0 && end!=start){
            
            curr-=petrol.get(start)-distance.get(start);
            start=(start+1)%n;
        }
        curr+=petrol.get(end)-distance.get(end);
        end=(end+1)%n;
       }
       
       System.out.println(start);
       
       
       
       
       
        
        
        
    }
}