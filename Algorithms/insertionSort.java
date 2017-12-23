import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int n=ar.length;
        int val=ar[n-1];
        int temp;
        for(int i=n-2;i>=0;i--){
            if(val<ar[i]){
                temp=ar[i];
                ar[i+1]=temp;
                printArray(ar);
                ar[i]=val;
                
                
            }
            else
                break;
        }
        printArray(ar);
        
        
        
        
        
        
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
