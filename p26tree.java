import java.util.Stack;
public class p26tree {


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
 
    // Recursive Solution
    public void inOrder(TreeNode root) {
        if(root !=  null) {
            inOrder(root.left);
            //Visit the node by Printing the node data
            System.out.printf("%d ",root.data);
            inOrder(root.right);
        }
    }
 
    // Iterative solution
    public void inOrderIter(TreeNode root) {
 
        if(root == null)
            return;
 
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode currentNode=root;
 
        while(!s.empty() || currentNode!=null){
 
            if(currentNode!=null)
            {
                s.push(currentNode);
                currentNode=currentNode.left;
            }
            else
            {
                TreeNode n=s.pop();
                System.out.printf("%d ",n.data);
                currentNode=n.right;
            }
        }
    }
 
    public static void main(String[] args)
    {
        p26tree bi=new p26tree();
        // Creating a binary tree
        TreeNode rootNode=createBinaryTree();
        System.out.println("Using Recursive solution:");
 
        bi.inOrder(rootNode);
 
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Using Iterative solution:");
 
        bi.inOrderIter(rootNode);
    }
 
    public static TreeNode createBinaryTree()
    {
    	 TreeNode rootNode =new TreeNode(10);
         TreeNode node20=new TreeNode(20);
         TreeNode node40=new TreeNode(40);
         TreeNode node50=new TreeNode(50);
         TreeNode node30=new TreeNode(30);
        
 
 
        rootNode.left=node20;
     
        node20.left=node40;
        node20.right=node50;
 
        rootNode.right=node30;
 
        return rootNode;
    }
}