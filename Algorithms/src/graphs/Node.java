package graphs;

import java.util.Iterator;

class Node  implements Iterator<Node>  {
	String nodeData;
	int nodeNumber;
	Node next;
	
	Node( String theNodeData, int nodeNum ) {
		this.nodeData = theNodeData;
		this.nodeNumber = nodeNum;
	}
	
	Node(int nodeNumber) {
		this.nodeNumber = nodeNumber;
	}
	

	@Override
	public boolean hasNext() {
		return next == null;
	}

	@Override
	public Node next() {
		// TODO Auto-generated method stub
		return this;
	}


}
