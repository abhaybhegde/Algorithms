package trees;

/*
 * Given 2 node values , find the least common ancestor of these nodes in a Binary Tree
 * 
 */




public class LeastCommonAncestor {

	public static Node leastCommonAncestorOf(Node root, int valueOne, int valueTwo) {
		
		if ( root == null) {
			return null;
		}
		
		if ( root.data == valueOne || root.data == valueTwo ) {
			return root;
		}
		
		Node left = leastCommonAncestorOf(root.leftChild, valueOne, valueTwo);
		Node right = leastCommonAncestorOf(root.rightChild, valueOne, valueTwo);
		
		if ( left != null && right != null ) {
			return root;
		}
		
		return (left != null) ? left : right;
	}
}
