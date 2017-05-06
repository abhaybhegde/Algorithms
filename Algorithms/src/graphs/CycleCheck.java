package graphs;

import java.util.*;

public class CycleCheck  {

	private int totalNumberOfVertices;

	private Map<Integer,List<Integer>> adjacencyListMap;
	
	private boolean isDirected;

	public CycleCheck(int vertices,boolean orientation) {
		this.totalNumberOfVertices = vertices;

		adjacencyListMap = new HashMap<>();
		this.isDirected = orientation;

		for( int i=0; i< this.totalNumberOfVertices; ++i ) {
			List<Integer> neighbours = new ArrayList<>();
			adjacencyListMap.put(i, neighbours);
		}

	}

	public void addEdges(int source, int destination) {
		if ( source < 0 || destination < 0 || source > totalNumberOfVertices 
				|| destination > totalNumberOfVertices ){
			throw new IllegalArgumentException("Illegal Source/Destination");
		}
		adjacencyListMap.get(source).add(destination);
		if(!isDirected) {
			// Graph is un-directed, then add source to destination's adjacency map
			adjacencyListMap.get(destination).add(source);
		}
		
	}

	public List<Integer> getAdjacentNodesOf(int source) {
		
		return adjacencyListMap.get(source);
	}


	public boolean hasCycle(CycleCheck g) {
		
		if ( g == null ) {
			throw new NullPointerException("Input Graph is null/empty.");
		}
		
		Set<Integer> yetToExplore = new HashSet<>();
		Set<Integer> currentlyExploring = new HashSet<>();
		Set<Integer> alreadyExplored = new HashSet<>();
		
		for ( int i=0; i < totalNumberOfVertices; ++i ) {
			yetToExplore.add(i);
		}
		
		// While there are vertices yet to be exlplored
		while(yetToExplore.size() > 0) {
			Integer current = yetToExplore.iterator().next();
			if ( dfs(g,current,yetToExplore,currentlyExploring,alreadyExplored) ) {
				return true;
			}
		}
		
		
		return false;
	}

	private boolean dfs(CycleCheck g, Integer current, Set<Integer> yetToExplore, Set<Integer> currentlyExploring,
			Set<Integer> alreadyExplored) {
		
		moveVertex(current,yetToExplore,currentlyExploring);
		
		// Explore all the adjacent vertices of the current, and perform dfs and other checks
		for( Integer eachAdjacentNode : getAdjacentNodesOf(current)) {
			
			//If the current node is already explored,continue
			if ( alreadyExplored.contains(eachAdjacentNode)) {
				continue;
			}
			
			//If the current node is in currentlyExploring state, then there is a cycle
			if(currentlyExploring.contains(eachAdjacentNode)) {
				return true;
			}
			
			// Perform dfs for the eachAdjacentNode
			
			if ( dfs(g,eachAdjacentNode,yetToExplore,currentlyExploring,alreadyExplored)) {
				return true;
			}
		}
		
		//If there are no cycles found, move the current vertex to alreadyExplored state
		moveVertex(current, currentlyExploring, alreadyExplored);
		return false;
	}

	private void moveVertex(Integer current, Set<Integer> sourceSet, Set<Integer> destinationSet) {
		
		sourceSet.remove(current);
		destinationSet.add(current);
	}

	//For un-directed Graph
	
	public boolean doesTheUndirectedGraphHasCycle(CycleCheck g) {
		
		if ( g.equals(null)) {
			return false;
		}
		
		Set<Integer> visited = new HashSet<>();
		for ( int i=0; i < totalNumberOfVertices;++i) {
			if (dfsUtility(g, i, visited, null)) {
				return true;
			}
		}
		return false;
		
	}

	private boolean dfsUtility(CycleCheck g, Integer eachNode, Set<Integer> visited, Integer parent) {
		
		visited.add(eachNode);
		
		for ( Integer neighBour : g.getAdjacentNodesOf(eachNode)) {
			
			if (visited.contains(neighBour)) {
				continue;
			}
			
			if ( neighBour.equals(parent)) {
				return true;
			}
			
			if ( dfsUtility(g, neighBour, visited, eachNode)) {
				return true;
			}
		}
		
		
		
		return false;
	}
}
