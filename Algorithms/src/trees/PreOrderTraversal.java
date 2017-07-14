package trees;

import java.util.ArrayList;
import java.util.List;

/*
 * Recursive implementation of Pre-order traversal for binary tree.
 */

public class PreOrderTraversal {
	
	public static void preOrderTraversal(Node root) {
		
		if ( root != null) {
			System.out.println(root.data);
			preOrderTraversal(root.leftChild);
			preOrderTraversal(root.rightChild);
			
		}
	}
	

}
