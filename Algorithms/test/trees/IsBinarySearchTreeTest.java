package trees;

import org.junit.Test;

import static org.junit.Assert.*;


public class IsBinarySearchTreeTest {
	
	@Test
	public void isBinarySearchTreeShouldReturnTrueWhenBSTIsPassed() {
		
		IsBinarySearchTree test = new IsBinarySearchTree();
		Node root = new Node(10);
		root.leftChild = new Node(5);
		root.rightChild = new Node(20);
		
		assertEquals(true, test.isBinarySearchTree(root));
		
	}
	
	@Test
	public void isBinarySearchTreeShouldReturnFalseWhenNonBSTIsPassed() {
		
		IsBinarySearchTree test = new IsBinarySearchTree();
		Node root = new Node(20);
		root.leftChild = new Node(15);
		root.rightChild = new Node(30);
		
		root.leftChild.leftChild = new Node(5);
		root.leftChild.rightChild = new Node(25);
		
		root.rightChild.leftChild = new Node(24);
		root.rightChild.rightChild = new Node(45);
		
		assertFalse(test.isBinarySearchTree(root));
		
	}
	

	@Test
	public void isBinarySearchTreeShouldReturnTrueWhenNullIsPassed() {
		
		IsBinarySearchTree test = new IsBinarySearchTree();
		Node root = null;

		assertTrue(test.isBinarySearchTree(root));
		
	}


}
