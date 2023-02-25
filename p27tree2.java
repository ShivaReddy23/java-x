public class p27tree2 {
	
		  int item;
		  p27tree2 left, right;

		  public p27tree2(int key) {
		  item = key;
		  left = right = null;
		  }
		}

		class Tree {
			p27tree2 root;

		  Tree() {
		  root = null;
		  }

		  void postorder(p27tree2 node) {
		    if (node == null)
		      return;

		    postorder(node.left);

		    postorder(node.right);

		    System.out.print(node.item + "->");
		  }

		  public static void main(String[] args) {

		    Tree tree = new Tree();

		    tree.root = new p27tree2(55);
		    tree.root.left = new p27tree2(21);
		    tree.root.right = new p27tree2(80);

		    tree.root.left.left = new p27tree2(9);
		    tree.root.left.right = new p27tree2(29);
		    tree.root.right.right = new p27tree2(76);
		    tree.root.right.left = new p27tree2(91);


		    System.out.println("Postorder traversal");
		    tree.postorder(tree.root);
		  
		  }
		}
