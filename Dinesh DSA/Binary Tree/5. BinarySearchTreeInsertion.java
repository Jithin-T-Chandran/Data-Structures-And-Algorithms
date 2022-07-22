/******************************************************************************

Binary Search Tree
*Faster search and insertion of data.
* Left subtree of node contains nodes with value less than the node.
* Right subtree of node contains nodes with value greater than the node.
* Right and left subtree are also a binary search tree.

*******************************************************************************/

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
    
    void insert(int value){
        root = insert(root,value);
    }
    
    TreeNode insert(TreeNode root,int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = insert(root.left,value);
        }else{
              root.right = insert(root.right,value);
        }
        return root;
    }
    
    void inOrder(){
        inOrder(root);
    }
    
    void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
	public static void main(String[] args) {
		Main mm = new Main();
		mm.insert(5);
		mm.insert(3);
		mm.insert(7);
		mm.insert(1);
		mm.inOrder();
	}
}
