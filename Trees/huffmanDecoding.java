/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
    
        String str=S;
        int i,j,k;
        int n=S.length();
            Node root1=root;
        
            //for(i=0;i<n;i++){
            
            i=0;   
            while(true){
                //System.out.println("i is: "+i);
                if(root.left==null && root.right==null){
                    System.out.print(root.data);
                    //i++;          
                  root=root1;
              
                    //break;
                }
                else if(str.charAt(i)=='0'){
                    root=root.left;
                    i++;
                }
                else if(str.charAt(i)=='1'){
                    root=root.right;
                    i++;
                }
                
                if(i==n+1)
                    break;
            }
            
            
        //}
    
    
    
    
    
    

       
    }
