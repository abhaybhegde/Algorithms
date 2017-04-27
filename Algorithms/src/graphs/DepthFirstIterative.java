package graphs;

import java.util.*;

public class DepthFirstIterative {
	
	private Stack<Integer> stackOfNodes;
	private boolean [] visitedNodes;
	
	public DepthFirstIterative(Graph g) {
		stackOfNodes = new Stack<Integer>();
		visitedNodes = new boolean[g.getTotalNoOfVertices()];
	}

	
	void dfs(Graph g, int source) {
		
		if ( source < 0 || source > g.getTotalNoOfVertices()) {
			throw new IllegalArgumentException();
		}
		
		stackOfNodes.push(source);
		visitedNodes[source] = true;
		System.out.println("Visited: " + source);
		
		while ( !stackOfNodes.isEmpty() ) {
			
			int nodeToProcess = stackOfNodes.pop();
			
			for ( int eachNode : g.getNodesAdjacentTo(nodeToProcess)) {
				
				if (!visitedNodes[eachNode]) {
					visitedNodes[eachNode] = true;
					stackOfNodes.push(eachNode);
					System.out.println("Visited:"+ eachNode);																																																										
				}
				
			}
			
		}
	}

}
