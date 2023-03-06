public class p77new {
	static class Node
	{
	    int data;
	    Node left;
	    Node right;
	};
	static Node newNode(int data)
	{
	    Node node = new Node();
	    node.data = data;
	    node.left = null;
	    node.right = null;
	 
	    return(node);
	}
	static boolean isSameStructure(Node a, Node b)
	{
	    if (a == null && b == null)
	        return true;
	    if (a != null && b != null)
	    {
	        return
	        (
	            isSameStructure(a.left, b.left) &&
	            isSameStructure(a.right, b.right)
	        );
	    }
	    return false;
	}
	public static void main(String args[])
	{
	    Node root1 = newNode(1);
	    Node root2 = newNode(2);
	    root1.left = newNode(3);
	    root1.right = newNode(4);
	    root1.left.left = newNode(5);
	   
	 
	    root2.left = newNode(1);
	    root2.right = newNode(2);
	    root2.left.left = newNode(3);
	    root2.left.right = newNode(4);
	    root2.right.right = newNode(5);
	 
	    if (isSameStructure(root1, root2))
	        System.out.printf("Both trees have same structure");
	    else
	        System.out.printf("Trees do not have same structure");
	}
	}
