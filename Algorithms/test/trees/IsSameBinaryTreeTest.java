package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsSameBinaryTreeTest {
	
	@Test
	public void isSameBinaryTreeShouldReturnTrueWhenIdenticalRootsArePassed() {
		
		Node rootOne = new Node(10);
		rootOne.leftChild = new Node(20);
		rootOne.rightChild = new Node(24);
		rootOne.leftChild.leftChild = new Node(15);
		rootOne.rightChild.rightChild = new Node(35);
		
		Node rootTwo = new Node(10);
		rootTwo.leftChild = new Node(20);
		rootTwo.rightChild = new Node(24);
		rootTwo.leftChild.leftChild = new Node(15);
		rootTwo.rightChild.rightChild = new Node(35);
		
		assertTrue(IsSameBinaryTree.isBinaryTreeSame(rootOne, rootTwo));
	}
	
	@Test
	public void isSameBinaryTreeShouldReturnFalseWhenNonIdenticalRootsArePassed() {
		
		Node rootOne = new Node(10);
		rootOne.leftChild = new Node(20);
		rootOne.rightChild = new Node(24);
		rootOne.leftChild.leftChild = new Node(15);
		rootOne.rightChild.rightChild = new Node(35);
		
		Node rootTwo = new Node(10);
		rootTwo.leftChild = new Node(20);
		rootTwo.rightChild = new Node(24);
		
		assertFalse(IsSameBinaryTree.isBinaryTreeSame(rootOne, rootTwo));
	}

}
