package graphs;

import java.util.Stack;

public class DepthFirstSearchRecursiveImpl {
	
	private boolean [] visitedNodes;
	private Stack<Integer> dfsStack;
	public DepthFirstSearchRecursiveImpl(Graph g, int source) {

		visitedNodes = new boolean [g.getTotalNoOfVertices()];
		dfsStack = new Stack<Integer>();
	}
	
	public void recursiveDepthFirstSearch(Graph g, int source) {
		if ( source < 0 || source > g.getTotalNoOfVertices()) {
			throw new IllegalArgumentException("Starting index is not valid.Must be > 0 and < totalNoOfVertices.");
		}
		visitedNodes[source] = true;
		// Process all adjacent nodes of source by calling recursiveDepthFirstSearch()
		for( int node : g.getNodesAdjacentTo(source)) {
			if ( !visitedNodes[node] ) {
				recursiveDepthFirstSearch(g, node);
			}
			
		}
	}

}
