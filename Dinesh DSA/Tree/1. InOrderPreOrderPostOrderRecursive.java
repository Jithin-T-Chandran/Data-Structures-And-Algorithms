/******************************************************************************
* Non linear DS
* Made up of nodes and edges
* Hierarchical structure with root node, no cycle formed.

*******************************************************************************/



//Pre-Order Traverse of a Binary tree  (Recursive)

public class Main
{
    private TreeNode root;
    
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    
      TreeNode(int data){
            this.data = data;
      }
    }
    
    void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        
        
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        
    }
    void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
        
    }
    void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        
    }
    void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
        
    }
    
	public static void main(String[] args) {
 	 Main mm = new Main();
	 mm.createBinaryTree();

 	 mm.inOrder(mm.root);

 	 System.out.println();

 	 mm.preOrder(mm.root);

 	 System.out.println();
     
 	 mm.postOrder(mm.root);
 	
	}
}
