package trees;

/*
 * Given a root node of a Binary Search Tree and a Key, return the node having Key.
 * 
 */

public class SearchKeyInBST {
	
	public static Node searchKeyInBST(Node root, int theKey) {
		
		if ( root == null) {
			return null;
		}
		
		if ( theKey == root.data) {
			return root;
		}
		//Can be optimized
		if ( theKey < root.data) {
			return searchKeyInBST(root.leftChild, theKey);
		} else {
			return searchKeyInBST(root.rightChild, theKey);
		}
		
	}

}
