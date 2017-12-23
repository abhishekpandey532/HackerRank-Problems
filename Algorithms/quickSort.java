import java.util.*;
class Solution {
       
       static ArrayList<Integer> al=new ArrayList<>();
       
          static void partition(int[] ar) {
            
            //System.out.println(al);
            int wall=0,curr=1;
            int n=ar.length;
            int temp;
            while(curr<n){
                if(al.get(curr)<=al.get(wall)){
                    temp=al.get(curr);
                    al.remove(curr);
                    al.add(wall,temp);
                    wall++;
                    curr++;
                    
                    
                }
                else{
                    curr++;
                }
                
                
            }
            for(int a:al)
              System.out.print(a+" ");
            
            
            
                    
       }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt();
              al.add(ar[i]);
           }
           partition(ar);
       }    
   }
