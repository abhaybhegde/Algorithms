package trees;

/*
 * Given a root of a binary tree, return its height
 */

public class BinaryTreeHeight {
	
	public static int returnHeightOfBinaryTree(Node root) {
		if ( root == null) {
			return 0;
		}
		
		int leftSubtreeHeight = returnHeightOfBinaryTree(root.leftChild);
		int rightSubtreeHeight = returnHeightOfBinaryTree(root.rightChild);
		
		return 1 + Math.max(leftSubtreeHeight, rightSubtreeHeight);
	}
	

}
