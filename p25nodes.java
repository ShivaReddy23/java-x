import java.util.Stack;
public class p25nodes {
	
    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }
 
   //  Recursive Solution
    public void preorder(TreeNode root) {
      if(root !=  null) {
            //Visit the node-Printing the node data  
           System.out.printf("%d ",root.data);
            preorder(root.left);
            preorder(root.right);
        }
   }
 
    // Iterative solution
    public void preorderIter(TreeNode root) {
 
        if(root == null)
            return;
 
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
 
        while(!stack.empty()){
 
            TreeNode n = stack.pop();
            System.out.printf("%d ",n.data);
 
            if(n.right != null){
                stack.push(n.right);
            }
            if(n.left != null){
                stack.push(n.left);
            }
 
        }
 
    }
 
    public static void main(String[] args)
    {
        p25nodes bi=new p25nodes();
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Using Recursive solution:");
 
        bi.preorder(rootNode);
 
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Using Iterative solution:");
 
        bi.preorderIter(rootNode);
    }
 
    public static TreeNode createBinaryTree()
    {
 
        TreeNode rootNode =new TreeNode(10);
        TreeNode node20=new TreeNode(20);
        TreeNode node40=new TreeNode(40);
        TreeNode node50=new TreeNode(50);
        TreeNode node30=new TreeNode(30);
       // TreeNode node50=new TreeNode(30);
       // TreeNode node70=new TreeNode(70);
 
        rootNode.left=node20;
        rootNode.right=node30;
 
        node20.left=node40;
        node20.right=node50;
 
       // node60.left=node50;
       // node60.right=node70;
 
        return rootNode;
    }
}