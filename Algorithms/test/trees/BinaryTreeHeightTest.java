package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeHeightTest {
	
	@Test
	public void test_with_null() {
		assertEquals(0,BinaryTreeHeight.returnHeightOfBinaryTree(null));
	}

}
