package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeastCommonAncestorTest {
	
	@Test
	public void test_leastCommonAncestor() {
		Node root = new Node(3);
		root.leftChild = new Node(5);
		root.leftChild.leftChild = new Node(6);
		root.rightChild = new Node(7);
		
		assertEquals(3,LeastCommonAncestor.leastCommonAncestorOf(root, 6, 7).data);
		
	}

}
