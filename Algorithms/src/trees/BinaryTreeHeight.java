package trees;

import org.apache.log4j.Logger;

/*
 * Given a root of a binary tree, return its height
 */

public class BinaryTreeHeight {
	
	final static Logger logger = Logger.getLogger(BinaryTreeHeight.class);
	public static int returnHeightOfBinaryTree(Node root) {
		if ( root == null) {
			logger.debug("Null root tree received");
			return 0;
		}
		
		int leftSubtreeHeight = returnHeightOfBinaryTree(root.leftChild);
		int rightSubtreeHeight = returnHeightOfBinaryTree(root.rightChild);
		
		return 1 + Math.max(leftSubtreeHeight, rightSubtreeHeight);
	}
	

}
