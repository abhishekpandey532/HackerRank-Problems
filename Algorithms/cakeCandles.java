import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int max=-999;
        
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        //System.out.println(max);
        int cnt=0;
        for(int i=0;i<n;i++){
            if(ar[i]==max)
                cnt++;
        }
            
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            if(ar[ar_i]>max)
                max=ar[ar_i];
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
