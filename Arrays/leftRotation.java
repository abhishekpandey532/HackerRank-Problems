/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    static int[] leftRotation(int[] a, int d) {
        // Complete this function
        int j;
        d=d%a.length;
        
        int a1[]=new int[d];
        int a2[]=new int[a.length];
        
        for(int i=0;i<d;i++){
            a1[i]=a[i];
        }
        
       /* System.out.println("A1:");
         for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]+" ");
        }*/
        
        int k=0;
        for(j=d;j<a.length;j++){
            a2[k]=a[j];
            k++;
        }
        
          /*System.out.println("A2:");
         for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i]+" ");
        }*/
        
           // System.out.println();

        
        int z=0;
        for(int l=a.length-d;l<a2.length;l++){
            a2[l]=a1[z];
            z++;
        }
        
        
        
        
        
        
        
        
        
        return a2;
      }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
