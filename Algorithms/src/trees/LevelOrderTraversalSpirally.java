package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Given a binary tree, for every even level of the tree
 * Print the nodes right to left and for every odd level
 * Print the nodes left to right
 */

/*
 * Approach 1:
 * Iterative approach,where we maintain two stack which will contain nodes of current level
 * being traversed.
 * 
 * While traversing a particular,we push the nodes(child) of the next level to another stack
 * and pop from current stack after exploring the node.
 * 
 *
 * 
 */


public class LevelOrderTraversalSpirally {

	/**
	 * @param root
	 * 
	 * @return List containing spirally traversed elements of the tree
	 */
	public static List<Integer> levelOrderTraversalSpirallyIterativeApproach(Node root) {
		if (root == null) {
			throw new NullPointerException("Root node is null.");
		}
		
		List<Integer> spiralTravesal = new ArrayList<>();

		// Only one node present
		if (root.leftChild == null && root.rightChild == null) {
			spiralTravesal.add(root.data);
			return spiralTravesal;
		}

		Stack<Node> evenStack = new Stack<Node>();
		Stack<Node> oddStack = new Stack<Node>();

		evenStack.push(root);

		while (!evenStack.isEmpty() || !oddStack.isEmpty()) {

			// If level is even
			while (!evenStack.isEmpty()) {

				Node temp = evenStack.peek();
				spiralTravesal.add(temp.data);
				evenStack.pop();

				if (temp.rightChild != null) {
					oddStack.push(temp.rightChild);
				}

				if (temp.leftChild != null) {
					oddStack.push(temp.leftChild);
				}

			}

			while (!oddStack.isEmpty()) {

				spiralTravesal.add(oddStack.peek().data);
				Node temp = oddStack.peek();
				if (temp.leftChild != null) {
					evenStack.push(temp.leftChild);
				}
				if (temp.rightChild != null) {
					evenStack.push(temp.rightChild);
				}
				oddStack.pop();
			}
		}
		
		return spiralTravesal;

	}

}
