package trees;

public class InOrderTraversal {

	public static void inOrderTraversal(Node root) {
		
		if ( root != null ) {
			
			inOrderTraversal(root.leftChild);
			System.out.println(root.data);
			inOrderTraversal(root.rightChild);
			
		}
		
	}
}
