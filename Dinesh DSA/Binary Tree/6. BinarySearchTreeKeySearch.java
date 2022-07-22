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
    public TreeNode search(int key){
        return search(root,key);
    }
    public TreeNode search(TreeNode root,int key){
        if(root == null || root.data == key){
            return root;
        }
        if(key < root.data){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
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
		if(mm.search(3) != null){
		    System.out.print("\nKey found");
		}else{
		    System.out.print("\nKey not found");
		}

	}
}
