package graphs;

import java.util.*;

public class BreadthFirstTraversal implements GraphOperations {
	
	private boolean [] visited;
	private int [] shortestPathTo;
	
	public BreadthFirstTraversal(Graph g ) {
		
		shortestPathTo = new int[g.getTotalNoOfVertices()];
		visited  = new boolean[g.getTotalNoOfVertices()];

	}
	
/*	public void bfs(Graph g, int source) {
		
		visited[source] = true;
		Queue<Integer> bfsQueue = new ArrayDeque<Integer>();
		bfsQueue.add(source);
		
		while ( !bfsQueue.isEmpty() ) {
			int node = bfsQueue.remove();
			for ( int eachNode : g.getNodesAdjacentTo(node)) {
				if ( ! visited[eachNode] ) {
					shortestPathTo[eachNode] = node;
					visited[eachNode] = true;
					bfsQueue.add(eachNode);
				}
			}
		}
	}
*/
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
		
		if ( source < 0 || source > g.getTotalNoOfVertices() || destination < 0 || destination > g.getTotalNoOfVertices()) {
			throw new IllegalArgumentException("Invalid source or destination node given.");
		}
		
		Queue<Integer> bfsQueue = new ArrayDeque<Integer>();
		bfsQueue.add(source);
		visited[source] = true;
		
		while(!bfsQueue.isEmpty()) {
			
			int nodeToProcess = bfsQueue.remove();
			for ( int eachNode : g.getNodesAdjacentTo(nodeToProcess)) {
				
				if ( destination == eachNode ) {
					return true;
				}
				
				if ( !visited[eachNode] ) {
					visited[eachNode] = true;
					bfsQueue.add(eachNode);
				}
			}
		}
		return false;
	}

	
}
