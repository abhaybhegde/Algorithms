package trees;

public class Node {
	
	int data;
	Node leftChild;
	Node rightChild;
	
	public Node(int data) {
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public static Node createNode(int data) {
		
		return new Node(data);
	}

}
