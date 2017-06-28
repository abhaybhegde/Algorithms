package trees;

/* Given a root of a binary tree , return the total no. of nodes present.
 * 
 */


public class SizeOfBinaryTree {
	
	public static int sizeOfBinaryTree(Node root) {
		int size =0;
		if ( root == null) {
			return 0;
		}
		
		int leftTreeSize = sizeOfBinaryTree(root.leftChild);
		int rightTreeSize = sizeOfBinaryTree(root.rightChild);
		
		size = leftTreeSize + rightTreeSize + 1;
		
		return size;
		
	}

}
