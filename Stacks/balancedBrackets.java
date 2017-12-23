import java.io.*;
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;
public class Solution { 
    boolean check_bal(String s,int length)
    {
    int i,top;
    char [] stack=new char [100000];
    top=-1;
    for(i=0;i<length;i++)
        {
        if((s.charAt(i)=='[') ||  (s.charAt(i)=='{') ||   (s.charAt(i)=='(' ) )
            {stack[++top]=s.charAt(i);}//if opening bracket, push
        if(s.charAt(i)==']')
            {
            if(top>=0 && stack[top]=='[') top-=1;//check if top>=0, since starting element cannot be a closing bracket
            else return false;
        }// if

        if(s.charAt(i)=='}')
            {
            if(top>=0 && stack[top]=='{') top-=1;
            else return false;
        }// if

        if(s.charAt(i)==')')
            {
            if(top>=0 && stack[top]=='(') top-=1;
            else return false;
        }// if

    }//for loop
    //System.out.println("Top:"+top);
    if(top==-1)return true ;
    else return false;
}//end of function

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int iter,len;
    boolean res;
    int t = in.nextInt();
    for(iter = 0; iter < t; iter++){
        String s = in.next();
        len=s.length();
        if(len%2!=0) System.out.println("NO");//if string is of odd length
        else{
        //System.out.println(len);
        res=new Solution().check_bal(s,len);
         if (res==true) System.out.println("YES");
         else System.out.println("NO");
        }//else
    }//for
}//main
}//Solution