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
	
	@Test
	public void test_with_right_skewed_tree() {
		
		Node root = new Node(24);
		root.rightChild = new Node(26);
		root.rightChild.rightChild = new Node(35);
		root.rightChild.rightChild.rightChild = new Node(40);
		assertEquals(40, SearchKeyInBST.searchKeyInBST(root,40).data);		
	}
	
	@Test
	public void test_with_left_skewed_tree() {
		
		Node root = new Node(24);
		root.leftChild = new Node(20);
		root.leftChild.leftChild = new Node(15);
		root.leftChild.leftChild.leftChild = new Node(12);
		assertEquals(12, SearchKeyInBST.searchKeyInBST(root,12).data);		
	}


}
