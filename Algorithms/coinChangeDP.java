import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    static long getWays(long n, long[] c){
        // Complete this function
        int o=c.length;
        long[][] a=new long[o][(int)n+1];
        
        for(int i=0;i<c.length;i++){
            a[i][0]=1;
        }
        
        for(int j=1;j<n+1;j++){
            if(c[0]>j)
                a[0][j]=0;
            else if(j%c[0]==0)
                a[0][j]=1;
            
          }
          
          
          
        
       /* for(int i=0;i<c.length;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        */
        for(int i=1;i<c.length;i++){
            for(int j=1;j<n+1;j++){
                if(c[i]>j)
                    a[i][j]=a[i-1][j];
                else
                    a[i][j]=a[i-1][j]+a[i][(int)(j-(int)c[i])];
            }
        }
        
        
        
       
       // System.out.println("\n\n");
        
        /*for(int i=0;i<c.length;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }*/
        
        return a[c.length-1][(int)n];
        
        
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
