import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        Map<Integer,Integer> m=new HashMap<>();
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            //al.add(k);
            if(m.containsKey(k)){
                int temp=m.get(k);
                m.put(k,temp+1);
            }
            else{
                m.put(k,1);
            }
        }
        for(int i=0;i<100;i++){
            if(m.containsKey(i))
                System.out.print(m.get(i)+" ");
            else
                System.out.print(0+" ");
        }
        
        
    }
}