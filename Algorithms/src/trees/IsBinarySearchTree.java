package trees;

/*
 *  Given a binary tree , find out if it is a Binary Search Tree or not
 * 
 * 
 */

/*
 * Algorithm:
 * We start with two extreme values Integer.MIN_VALUE and Integer.MAX_VALUE
 * We visit each node starting from the root
 * For each node,we check if the node value falls within this range.
 * If it falls within that range, we return true or else false;
 */

public class IsBinarySearchTree {
	
	public boolean isBinarySearchTree(Node root) {
		
		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		
	}

	private boolean isBSTUtil(Node root, int minValue, int maxValue) {
		
		if ( root == null ) {
			return true;
		}
		
		if ( root.data <= minValue || root.data > maxValue ) {
			return false;
		}
		
		return isBSTUtil(root.leftChild, minValue, root.data) && isBSTUtil(root.rightChild, root.data, maxValue);
		
	}

}
