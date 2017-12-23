import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int zsum=0,psum=0,nsum=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]<0)
                nsum++;
            else if(arr[i]>0)
                psum++;
            else
                zsum++;
        }
        
        System.out.println((double)psum/n);
        System.out.println((double)nsum/n);
        System.out.println((double)zsum/n);
        
        
        
    }
}
