package trees;

import static org.junit.Assert.*;

import org.junit.Test;

import trees.Node;

public class LevelOrderTraversalSpirallyTest {
	
	@Test
	public void test() {
		Node root = new Node(20);
		root.leftChild = new Node(15);
		root.rightChild = new Node(30);
		
		root.leftChild.leftChild = new Node(12);
		root.leftChild.rightChild = new Node(16);
		
		root.rightChild.leftChild = new Node(25);
		root.rightChild.rightChild = new Node(40);
		assertEquals("[20, 15, 30, 40, 25, 16, 12]",LevelOrderTraversalSpirally.levelOrderTraversalSpirallyIterativeApproach(root).toString());
	}
	

}
