
Practice
Compete
Jobs
Rank
Leaderboard

codeandcode
DashboardData StructuresArraysSparse Arrays
Points: 691.5Rank: 3567
Sparse Arrays
by ikbalkazar
Problem
Submissions
Leaderboard
Discussions
Editorial
People who solved Sparse Arrays attempted this next:
Array Manipulation
Perform m operations on an array and print the maximum of the values.

Submitted 11 days agoScore:25.00Status: Accepted
Challenge your friends:
Test Case #0
Test Case #1
Test Case #2
Test Case #3
Test Case #4
Test Case #5
Test Case #6
Test Case #7
Test Case #8
Test Case #9
Test Case #10
Submitted Code
Language: Java 7Open in editor

1
/* package whatever; // don't place package name! */
2
​
3
import java.util.*;
4
import java.lang.*;
5
import java.io.*;
6
import java.io.*;
7
import java.util.*;
8
import java.text.*;
9
import java.math.*;
10
import java.util.regex.*;
11
/* Name of the class has to be "Main" only if the class is public. */
12
class Ideone
13
{
14
     public static void main (String[] args) throws java.lang.Exception
15
     {
16
        Scanner sc = new Scanner(System.in);
17
        int len=sc.nextInt();
18
        int q;
19
        String str;
20
        String s[]=new String[len];
21
        
22
        //System.out.println(len);
23
        
24
        for(int i=0;i<len;i++){
25
            s[i]=sc.next();
26
        //  System.out.println(s[i]);
27
        }
28
        
29
        q=sc.nextInt();
30
        //System.out.println(q);
31
        int count=0;
32
        for(int i=0;i<q;i++){
33
            str=sc.next();
34
            count=0;
35
            for(int j=0;j<s.length;j++){
36
                if(s[j].equals(str))
37
                count++;
38
            }
39
            System.out.println(count);
40
            
41
            
42
        }
43
        
44
        
45
        
46
        
47
        
48
    }
49
}
50
​
Contest Calendar | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy | Request a Feature