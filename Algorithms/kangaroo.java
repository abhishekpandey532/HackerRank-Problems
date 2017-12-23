import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        ArrayList<Long> a1=new ArrayList<>();
        ArrayList<Long> a2=new ArrayList<>();

        long s1=(long)x1,s2=(long)x2;
        if(x2>x1 && v2>v1)
            return "NO";
        if(x2<x1 && v2<v1)
            return "NO";
        
       for(int i=0;i<10000;i++){
          s1+=v1;
           s2+=v2;
           if(s1==s2)
               return "YES";
                
       }
        return "NO";
        
        
        
       /* if(x1==x2)
            return "Yes";
        s1=(long)(x1+v1);
        s2=(long)(x2+v2);
        a1.add(s1);
        a2.add(s2);
        for(int i=1;i<500;i++){
            a1.add(a1.get(i-1)+v1);
            a2.add(a2.get(i-1)+v2);
            
        }
        if(!Collections.disjoint(a1,a2))
            return "YES";
        else
            return "NO";
        //System.out.println(a2);
        
        //return "Some";
        */
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
