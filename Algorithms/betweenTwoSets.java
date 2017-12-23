import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b){
        // Complete this function
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> b1=new ArrayList<>();
        
        for(int i=0;i<a.length;i++)
            a1.add(a[i]);
        for(int i=0;i<b.length;i++)
            b1.add(b[i]);
        
        Collections.sort(a1);
        Collections.sort(b1);
        
        int curr=Collections.max(a1);
        int add=curr;
        int lim=Collections.max(b1);
        int check1=0,check2=0;
        int count=0;
        while(true){
            for(int i=0;i<a1.size();i++){
                if(curr%a1.get(i)==0)
                    check1++;
            }
            if(check1==(a1.size())){
                for(int i=0;i<b1.size();i++){
                    if(b1.get(i)%curr==0)
                        check2++;
                }
                
            }
            
            if(check2==b1.size())
                count++;
            
            check1=0;
            check2=0;
            curr+=add;
            if(curr>lim)
                break;
        }
        //System.out.println(count);
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
