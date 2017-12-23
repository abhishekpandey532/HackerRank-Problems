import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxsum=Integer.MIN_VALUE;
        int sum=Integer.MIN_VALUE;
        int arr[][] = new int[6][6];

        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                sum=0;
                sum+=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                
                //if(sum==31){
                 //   System.out.println("Got max sum at: "+i+" "+j);
                //}
                
                if(sum>=maxsum)
                    maxsum=sum;
                    
                
            }
        }
        
        System.out.print(maxsum);
        
        
    }
}
