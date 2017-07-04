package trees;

/*
 * Given root of two binary trees, return if they are same or not
 * 
 * Approach 1:
 * We first check if both roots are null, if it is then we return true
 * We one of the node is null and other is not , we return false
 * We then check if the data is same && recursively check left and right subtree
 */

public class IsSameBinaryTree {
	
	public static boolean isBinaryTreeSame(Node rootOne, Node rootTwo) {
		
		if ( rootOne == null && rootTwo == null ) {
			return true;
		}
		
		//If either of rootOne or rootTwo is null , return false
		if ( rootOne == null || rootTwo == null) {
			return false;
		}
		
		return (rootOne.data == rootTwo.data) && isBinaryTreeSame(rootOne.leftChild, rootTwo.leftChild)
				&& isBinaryTreeSame(rootOne.rightChild, rootTwo.rightChild);
		
	}

}
