import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        //Calucalting the diagonal difference
        
        // Primary diagonal sum is:
        int psum=0,ssum=0;
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==j)
                psum+=a[i][j];
            }
        }
        
        //Secodary diagonal sum
        int k=n-1;
        for(int i=0;i<n;i++)
        {
            ssum+=a[i][k];
            k--;
        }
        System.out.println(Math.abs((psum-ssum)));        
        
    }
}
