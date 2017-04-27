package graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Graph {


	private final int totalNoOfVertices;
	public int getTotalNoOfVertices() {
		return totalNoOfVertices;
	}

	private int totalNoOfEdges;
	Map<Integer, LinkedList<Integer>> adjListMap;


	
	public Graph(String fileName) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File(fileName));
		
		int numberOfVertices = sc.nextInt();
		if ( numberOfVertices < 0 ) {
			sc.close();
			throw new IllegalArgumentException("Invalid Vertices.Vertices must be > 0.");
		}
		this.totalNoOfVertices = numberOfVertices;

		int numberOfEdges = sc.nextInt();
		if ( numberOfEdges < 0 ) {
			sc.close();
			throw new IllegalArgumentException("Invalid input Edges. Must > 0");
			
		}
		this.totalNoOfEdges =  numberOfEdges;

		
		adjListMap = new HashMap<Integer,LinkedList<Integer>>();
		
		//Create empty Graph based on totalNumOfVertices and totalNoOfEdges
		for ( int vertex = 0 ; vertex < totalNoOfVertices; ++ vertex) {
			LinkedList<Integer> neighBours = new LinkedList<Integer>();
			adjListMap.put(vertex, neighBours);
		}
		
		//Start reading the rest of the input file and populate the graph
		while ( sc.hasNextLine()) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			addEdge(source,destination);
		}
		sc.close();
		
	}
	
	public void addEdge(int source , int destination) {
		
		if ( source < 0 || destination < 0 ) {
			throw new IllegalArgumentException("Source or Destination value > 0");
		}
		
		// Add destination node to source's adjacency list
		LinkedList<Integer> destinationNode = new LinkedList<Integer>();
		destinationNode.add(destination);
		adjListMap.get(source).addAll(destinationNode);
		
		// Add source node to destination's adjacency List.
		LinkedList<Integer> sourceNode = new LinkedList<Integer>();
		sourceNode.add(source);
		adjListMap.get(destination).addAll(sourceNode);
		
		
	}

	public Iterable<Integer> getNodesAdjacentTo(int source) {
		
		return adjListMap.get(source);
		
	}

	public int getTotalNoOfEdges() {
		return totalNoOfEdges;
	}
	
/*	@Override
	public String toString() {
		
		String s = this.totalNoOfVertices	 + " vertices," + this.totalNoOfEdges +" edges";
		for ( int i = 0; i < this.totalNoOfVertices; ++i) {
			s += this.totalNoOfVertices + ":";
			for ( int w : this.getNodesAdjacentTo(i)) {
				s += w + " ";
			}
			s += "\n";
		}
		return s;
		
	}*/
	
	
	
	
}
