import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int equalHeights(int[] st1, int[] st2, int[] st3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        
        for (int i = 0; i < st1.length; i++)
            sum1 += st1[i];
        
        for (int i = 0; i < st2.length; i++)
            sum2 += st2[i];
        
        for (int i = 0; i < st3.length; i++)
            sum3 += st3[i];
        
        int i = 0, j = 0, k = 0;
        while (i < st1.length && j < st2.length && k < st3.length) {
            if (sum1 == sum2 && sum2 == sum3) 
                    break;
            
            int max_height = Math.max(sum1, Math.max(sum2, sum3));
            if      (sum1 == max_height) sum1 -= st1[i++];
            else if (sum2 == max_height) sum2 -= st2[j++];
            else                         sum3 -= st3[k++];
        }
        
        return Math.min(sum1, Math.min(sum2, sum3));
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        int[] st1 = new int[n1];
        int[] st2 = new int[n2];
        int[] st3 = new int[n3];
        
        for (int i = 0; i < n1; i++)
            st1[i] = in.nextInt();
        
        for (int i = 0; i < n2; i++) 
            st2[i] = in.nextInt();
        
        for (int i = 0; i < n3; i++) 
            st3[i] = in.nextInt();
        
        int height = Solution.equalHeights(st1, st2, st3);
        System.out.println(height);
    }
}