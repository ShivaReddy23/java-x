/public class p84bin {
	class Node
	{
	    int data;
	    Node left, right;
	  
	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	  
	class Result 
	{
	    int res = 0;
	}
	  
	class BinaryTree
	{
	    Node root; 
	    int longestConsecutive(Node root)
	    {
	        if (root == null)
	            return 0;
	  
	        Result res = new Result();
	           
	        longestConsecutiveUtil(root, 0, root.data, res);
	          
	        return res.res;
	    } 
	    private void longestConsecutiveUtil(Node root, int curlength, 
	                                        int expected, Result res)
	    {
	        if (root == null)
	            return; 
	        if (root.data == expected)
	            curlength++;
	        else
	            curlength = 1; 
	        res.res = Math.max(res.res, curlength);
	   
	        longestConsecutiveUtil(root.left, curlength, root.data + 1, res);
	        longestConsecutiveUtil(root.right, curlength, root.data + 1, res);
	    }
	    public static void main(String args[]) 
	    {
	        BinaryTree tree = new BinaryTree();
	  
	        tree.root = new Node(1);
	        tree.root.right = new Node(3);
	        tree.root.right.left = new Node(2);
	        tree.root.right.right = new Node(4);
	        tree.root.right.right.right = new Node(5);
	        tree.root.right.right.right.right = new Node(6);
	  
	        System.out.println(tree.longestConsecutive(tree.root));
	    }
	}

