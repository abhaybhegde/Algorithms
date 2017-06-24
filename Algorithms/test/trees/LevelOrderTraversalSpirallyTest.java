package trees;

import static org.junit.Assert.*;

import org.junit.Test;

import trees.Node;

public class LevelOrderTraversalSpirallyTest {
	
	@Test
	public void test_with_binarySearchTree() {
		Node root = new Node(20);
		root.leftChild = new Node(15);
		root.rightChild = new Node(30);
		
		root.leftChild.leftChild = new Node(12);
		root.leftChild.rightChild = new Node(16);
		
		root.rightChild.leftChild = new Node(25);
		root.rightChild.rightChild = new Node(40);
		assertEquals("[20, 15, 30, 40, 25, 16, 12]",LevelOrderTraversalSpirally.levelOrderTraversalSpirallyIterativeApproach(root).toString());
	}
	
	@Test
	public void test_with_rightSkewedTree() {
		Node root = new Node(20);
		root.rightChild = new Node(30);
		root.rightChild.rightChild = new Node(40);
		root.rightChild.rightChild.rightChild = new Node(50);
		assertEquals("[20, 30, 40, 50]",LevelOrderTraversalSpirally.levelOrderTraversalSpirallyIterativeApproach(root).toString());
	}
	
	@Test
	public void test_with_leftSkewedTree() {
		Node root = new Node(20);
		root.leftChild = new Node(30);
		root.leftChild.leftChild = new Node(40);
		root.leftChild.leftChild.leftChild = new Node(50);
		assertEquals("[20, 30, 40, 50]",LevelOrderTraversalSpirally.levelOrderTraversalSpirallyIterativeApproach(root).toString());
	}
	
	@Test(expected=NullPointerException.class)
	public void test_with_null() {
		Node root = null;
		LevelOrderTraversalSpirally.levelOrderTraversalSpirallyIterativeApproach(root);
	}
	
	
	

}
