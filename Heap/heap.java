import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in = new Scanner(System.in);
int n = in.nextInt();
TreeSet<Integer> sortedset = new TreeSet<Integer>();
Stack<Integer> heap = new Stack<Integer>();
for (int i = 0; i < n; i++) {
    int cmnd = in.nextInt();
    if (cmnd == 1) {
        int e = in.nextInt();
        heap.push(e);
        sortedset.add(e);
    } else if (cmnd == 2) {
        int e = in.nextInt();               
        heap.removeElement(e);
        sortedset.remove(e);
    } else {
        System.out.println(sortedset.first());              
    }
}
    }
}