import java.util.*;

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
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        
        
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        
    }
    void inOrder(TreeNode root){
        if(root == null){
            return;
         }
         
       Stack<TreeNode> stack = new Stack<>();
       TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }
    
    void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
        
    }
    /*
    TODO
    void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        
      
        
    }
    */
    
	public static void main(String[] args) {
 	 Main mm = new Main();
	 mm.createBinaryTree();

  mm.inOrder(mm.root);

  System.out.println();

  mm.preOrder(mm.root);

  System.out.println();
     
 //	 mm.postOrder(mm.root);
 	
	}
}
