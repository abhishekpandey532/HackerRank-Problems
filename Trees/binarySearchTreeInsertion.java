 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
    if(root==null){
        Node n=new Node();
        n.data=value;
        n.left=null;
        n.right=null;
        root=n;
    }
    else if(value <= root.data)
        root.left=Insert(root.left,value);
    else
        root.right=Insert(root.right,value);
    
    return root;    
}


