import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    static String super_reduced_string(String s){
        // Complete this function
        //String newstr=s; 
        String s1=s;
        int flg=0;
        while(true){
            //s1=s;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    s=s.substring(0,i-1) + s.substring(i+1);
                }
                if(s.equals("")) {
                 flg=1;
                 //System.out.println("Empty Bro");
                }
            }
                if(flg==1){
                    return "Empty String";
                }
                else{
                if(s1==s)
                    break;
                s1=s;   
                //System.out.println(s);
                }//break;
            }
        return s;
        }
        
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
