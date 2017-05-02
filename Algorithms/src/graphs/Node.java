package graphs;


class Node   {
	String nodeData;
	int nodeNumber;
	boolean isVisited;

	
	Node next;
	
	Node( String theNodeData, int nodeNum ) {
		this.nodeData = theNodeData;
		this.nodeNumber = nodeNum;
	}
	
	Node(int nodeNumber) {
		this.nodeNumber = nodeNumber;
	}
	
	Node() {
		this.nodeData = null;
		this.nodeNumber=0;
		this.isVisited=false;
		this.next=null;
	}

}
