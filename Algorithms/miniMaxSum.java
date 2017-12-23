import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> al=new ArrayList<>();
       
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            al.add(in.nextLong());
        }
        //System.out.println(al.get(0));
        Collections.sort(al);
        long sum=0L;
        
        for(int i=0;i<4;i++)
            sum+=al.get(i);
        System.out.print(sum);
        sum=0;
       
        
        
        for(int i=al.size()-1;i>al.size()-5;i--)
            sum+=al.get(i);
        System.out.print(" "+sum);
       
    }
}
