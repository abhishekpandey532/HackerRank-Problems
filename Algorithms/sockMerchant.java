import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        Map<Integer,Integer> m1 = new HashMap<>();
        for(int i=0;i<n;i++){
            //m1.put(ar[i])
            if(m1.containsKey(ar[i])) { 
                int v=(m1.get(ar[i]))+1;
                m1.put(ar[i],v);
            }
            else
                m1.put(ar[i],1);
            
        }
        //System.out.println(m1);
        int count=0;
        //System.out.println((m1.get(1)));
        for(int value: m1.values()){
            //System.out.println(value);
            count+=value/2;
            }
    return count;
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
