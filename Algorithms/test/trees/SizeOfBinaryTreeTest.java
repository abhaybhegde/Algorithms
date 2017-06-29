package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class SizeOfBinaryTreeTest {
	
	@Test
	public void sizeOfBinaryShouldReturnSizeWhenRootIsPassed() {
		
		Node root = new Node(10);
		root.leftChild = new Node(20);
		root.rightChild = new Node(24);
		root.leftChild.leftChild = new Node(15);
		root.rightChild.rightChild = new Node(35);
		
		assertEquals(5,SizeOfBinaryTree.sizeOfBinaryTree(root));
		 
		
	}

}
