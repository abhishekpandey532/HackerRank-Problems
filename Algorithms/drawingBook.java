import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    static int solve(int n, int p){
        // Complete this function
        //Even pages last has only 1 page
        // Odd Pages last has 2 pages
        int st,en;
        st=p-0;
        en=n-p;
        int val=0;
        if(st<=en){
            if(p==1)
                return 0;
            else{
                val=(p/2);
            }
            
        }
        else{
            if(n==p)
                return 0;
            else {
            if(n%2==0){ //even pages last only one
                if(p%2==0)
                    val=(n-p)/2;
                else{
                    p=p+1;
                    val=(n-p)/2+1;
                }
                    
                }
            else{//odd pages
                val=n-p;
                val=val/2;
            }
        }
        }
        return val;
        
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
