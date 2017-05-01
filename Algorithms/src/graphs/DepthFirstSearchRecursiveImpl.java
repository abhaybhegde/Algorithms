package graphs;


public class DepthFirstSearchRecursiveImpl {
	
	private boolean [] visitedNodes;
	public DepthFirstSearchRecursiveImpl(Graph g, int source) {

		visitedNodes = new boolean [g.getTotalNoOfNodesInGraph()];
	}
	
	public void recursiveDepthFirstSearch(Graph g, int source) {
		if ( source < 0 || source > g.getTotalNoOfNodesInGraph()) {
			throw new IllegalArgumentException("Starting index is not valid.Must be > 0 and < totalNoOfVertices.");
		}
		visitedNodes[source] = true;
		// Process all adjacent nodes of source by calling recursiveDepthFirstSearch()
		for( Node node : g.getAdjacentNodesOf(source)) {
			if ( !visitedNodes[node.nodeNumber] ) {
				recursiveDepthFirstSearch(g, node.nodeNumber);
			}
			
		}
	}

}
