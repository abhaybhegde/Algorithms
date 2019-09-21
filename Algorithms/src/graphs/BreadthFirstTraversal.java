package graphs;

import java.util.*;

public class BreadthFirstTraversal implements GraphOperations {
	
	private boolean [] visited;
	private int [] shortestPathTo;
	
	public BreadthFirstTraversal(Graph g ) {
		
		shortestPathTo = new int[g.getTotalNoOfNodesInGraph()];
		visited  = new boolean[g.getTotalNoOfNodesInGraph()];

	}

	public boolean hasPathTo(int destination) {
		return visited[destination];
	}
	
	
	public Iterable<Integer> pathTo(int destination) {
		
		if ( !hasPathTo(destination)) {
			return null;
		}
		
		Stack<Integer> path = new Stack<Integer>();
		for ( int x = destination; x != destination; x = shortestPathTo[destination]) {
			path.push(x);
		}
		path.push(destination);
		return path;
	}

	
	
	@Override
	public boolean isReachable(Graph g, int source, int destination) {
		
		if ( source < 0 || source > g.getTotalNoOfNodesInGraph() || destination < 0 || destination > g.getTotalNoOfNodesInGraph()) {
			throw new IllegalArgumentException("Invalid source or destination node given.");
		}
		
		Node sourceNode = new Node(source);
		Queue<Node> bfsQueue = new ArrayDeque<Node>();
		bfsQueue.add(sourceNode);
		visited[sourceNode.nodeNumber] = true;
		
		while(!bfsQueue.isEmpty()) {
			
			Node nodeToProcess = bfsQueue.remove();
			for ( Node eachNode : g.getAdjacentNodesOf(nodeToProcess.nodeNumber)) {
				
				if ( destination == eachNode.nodeNumber) {
					return true;
				}
				
				if ( !visited[eachNode.nodeNumber] ) {
					visited[eachNode.nodeNumber] = true;
					bfsQueue.add(eachNode);
				}
			}
		}
		return false;
	}

	
}
