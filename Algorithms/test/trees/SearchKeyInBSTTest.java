package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchKeyInBSTTest {
	
	@Test
	public void test() {
		
		Node root = new Node(24);
		root.leftChild = new Node(21);
		root.rightChild = new Node(26);
		root.leftChild.leftChild = new Node(15);
		root.rightChild.rightChild = new Node(35);
		
		assertEquals(15,SearchKeyInBST.searchKeyInBST(root,15).data);		
	}
	
	@Test
	public void test_with_null() {
		
		Node root = null;
		
		assertEquals(null, SearchKeyInBST.searchKeyInBST(root,15));		
	}
	
	@Test
	public void test_with_invalid_key() {
		
		Node root = new Node(24);
		root.leftChild = new Node(21);
		root.rightChild = new Node(26);
		root.leftChild.leftChild = new Node(15);
		root.rightChild.rightChild = new Node(35);
		
		assertEquals(null, SearchKeyInBST.searchKeyInBST(root,30));		
	}


}
