   /* Class node is defined as :
    class Node 
       int val;   //Value
       int ht;      //Height
       Node left;   //Left child
       Node right;   //Right child

   */

    static Node maketree(Node root,int val){
        if(root==null){
            Node n=new Node();
            n.val=val;
            n.left=null;
            n.right=null;
            n.ht=0;
            root=n;
            return root;
        }
        else if(val<=root.val)
            root.left=maketree(root.left,val);
        else
            root.right=maketree(root.right,val);
        
        root.ht=Math.max(height(root.left),height(root.right))+1;
        
        int bal=getbal(root);
           
        if(bal>1 && val<root.left.val){
            root=rightRotate(root);
            //Left-Left
        }
        if(bal>1 && val>root.left.val){
            root.left=leftRotate(root.left);
            return rightRotate(root);
            //Left-Right
        }
        if(bal<-1 && val>root.right.val){
            root=leftRotate(root);
            //Right-Right
        }
        if(bal<-1 && val<root.right.val){
            root.right=rightRotate(root.right);
            return leftRotate(root);
            //Right-Left
        }
            
            
            
            
            
        return root;

            
        }

    static Node leftRotate(Node root){
        Node x=root;
        Node y=x.right;
        
        Node t2=y.left;
        
        x.right=t2;
        y.left=x;
        
        x.ht = Math.max(height(x.left), height(x.right)) + 1;
        y.ht = Math.max(height(y.left), height(y.right)) + 1;
        
        return y;
        
        
        
        
    }


    static Node rightRotate(Node root){
        Node child,gchild;
        child=root.left;

        root.left=child.right;
        child.right=root;
        
        root.ht = Math.max(height(root.left), height(root.right)) + 1;
        child.ht = Math.max(height(child.left), height(child.right)) + 1;
        
        return child; 
    }

    static int getbal(Node root){
        if(root==null){
            return 0;
        }
        return height(root.left)-height(root.right);
    }
        
        
        
        
    
    
    static int height(Node root){
        
        if(root==null){
            return -1;
        }
        int hit=Math.max(height(root.left),height(root.right))+1;
        
        return hit;
        
    
    }

 

    static Node insert(Node root,int val){

        root=maketree(root,val);    
        
        //findheight(root);
        
        //System.out.println("Root is: "+ root.val);
       // System.out.println("Root is: "+ root.left.val);
        // System.out.println("Root is: "+ root.right.val);
        //int k=height(root);
        
        //balance(root);
        
        //System.out.println("Root height is: "+ root.ht);
        
        
        return root;
        

        
    }
