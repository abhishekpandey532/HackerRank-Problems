   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
      static int count=0;

    void topView(Node root) {
      
        if(root.left!=null && count>=0){
            count++;
            topView(root.left);
            }

        System.out.print(root.data+ " ");
        count--;

        if(root.right!=null && count<0){
        //count--;
        topView(root.right);

        }
    }
       
      
    
