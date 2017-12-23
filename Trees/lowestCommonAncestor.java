

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
    {
    int lca;
    while(true){
        if(v1<root.data && v2<root.data)
            root=root.left;
        else if(v1>root.data && v2>root.data)
            root=root.right;
        
        else{
            lca=root.data;
            return root;
        }
        
        
    }

       
    }




