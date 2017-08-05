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
		root.leftChild.leftChild = new Node(7);
		root.rightChild.rightChild = new Node(9);
		
		
		assertEquals(3,BinaryTreeHeight.returnHeightOfBinaryTree(root) );
		
	}
	
	@Test
	public void test_with_left_skewed_trees() {
		
		Node root = new Node(10);
		root.leftChild = new Node(5);
		root.leftChild.leftChild = new Node(7);
		root.leftChild.leftChild.leftChild = new Node(9);
		
		
		assertEquals(4,BinaryTreeHeight.returnHeightOfBinaryTree(root) );
		
	}
	
	@Test
	public void test_with_right_skewed_trees() {
		
		Node root = new Node(10);
		root.rightChild = new Node(5);
		root.rightChild.rightChild = new Node(7);
		root.rightChild.rightChild.rightChild = new Node(9);
		
		
		assertEquals(4,BinaryTreeHeight.returnHeightOfBinaryTree(root) );
		
	}

}
