package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeHeightTest {
	
	@Test
	public void test_with_null() {
		assertEquals(0,BinaryTreeHeight.returnHeightOfBinaryTree(null));
	}
	
	@Test
	public void test_with_minimal_nodes() {
		
		Node root = new Node(10);
		root.leftChild = new Node(5);
		root.rightChild = new Node(20);
		
		assertEquals(2,BinaryTreeHeight.returnHeightOfBinaryTree(root) );
		
	}

}
