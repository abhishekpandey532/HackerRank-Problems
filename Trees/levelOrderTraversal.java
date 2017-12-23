   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
    static Deque<Node> da=new LinkedList<Node>();
   void levelOrder(Node root) {
       
       da.add(root);
       
       while(!da.isEmpty()){
       
       Node fr=da.removeFirst();
       
       System.out.print(fr.data+" ");
       
       if(fr.left!=null)
           da.add(fr.left);
       if(fr.right!=null)
           da.add(fr.right);
           
       }
       
       
       
       
       
       
       
       
      
      
    }
