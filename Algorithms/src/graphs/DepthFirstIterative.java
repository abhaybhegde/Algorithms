package graphs;

import java.util.*;

public class DepthFirstIterative {
	
	private Stack<Node> stackOfNodes;
	private boolean [] visitedNodes;
	
	public DepthFirstIterative(Graph g) {
		stackOfNodes = new Stack<Node>();
		visitedNodes = new boolean[g.getTotalNoOfNodesInGraph()];
	}

	
	void dfs(Graph g, Node source) {
		
		if ( source.equals(null)) {
			throw new IllegalArgumentException();
		}
		
		stackOfNodes.push(source);
		visitedNodes[source.nodeNumber] = true;
		System.out.println("Visited: " + source);
		
		while ( !stackOfNodes.isEmpty() ) {
			
			Node nodeToProcess = stackOfNodes.pop();
			
			for ( Node eachNode : g.getAdjacentNodesOf(nodeToProcess.nodeNumber)) {
				
				if (!visitedNodes[eachNode.nodeNumber]) {
					visitedNodes[eachNode.nodeNumber] = true;
					stackOfNodes.push(eachNode);
					System.out.println("Visited:"+ eachNode.nodeNumber);																																																										
				}
				
			}
			
		}
	}

}
