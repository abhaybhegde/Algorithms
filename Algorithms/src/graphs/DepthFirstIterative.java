package graphs;

import java.util.*;

import org.apache.log4j.Logger;



public class DepthFirstIterative {
	
	final static Logger logger = Logger.getLogger(DepthFirstIterative.class);
	
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
		logger.debug("Visited: " + source);
		
		while ( !stackOfNodes.isEmpty() ) {
			
			Node nodeToProcess = stackOfNodes.pop();
			logger.debug("Processing Node:" + nodeToProcess.nodeNumber);
			
			for ( Node eachNode : g.getAdjacentNodesOf(nodeToProcess.nodeNumber)) {
				
				if (!visitedNodes[eachNode.nodeNumber]) {
					visitedNodes[eachNode.nodeNumber] = true;
					stackOfNodes.push(eachNode);
					logger.debug("Visited:"+ eachNode.nodeNumber);																																																										
				}
				
			}
			
		}
	}

}
