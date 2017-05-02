package graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Graph {

	private int totalNoOfNodes; 
	private static boolean isDirected;
	private HashMap<Integer,ArrayList<Node>> adjacencyListMap;
	private HashMap<String,Integer> nameToNodeMap;//Map Node data to integer(vertex)
	private Map<Integer,String> nodeToNameMap;// Map vertex or node number to corresponding node data

	public Graph(String inputFileName) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(inputFileName));
		String orientation = sc.next();
		if("directed".equals(orientation)) {
			// Graph is directed 
			isDirected = true;
		} else {
			isDirected = false;
		}

		adjacencyListMap = new HashMap<Integer,ArrayList<Node>>();
		nameToNodeMap = new HashMap<String,Integer>();
		nodeToNameMap = new HashMap<Integer,String>();

		int numberOfNodes = sc.nextInt();
		this.totalNoOfNodes =  numberOfNodes;


		for ( int i =0; i < totalNoOfNodes; ++i ) {
			ArrayList<Node> neighbours = new ArrayList<Node>();
			adjacencyListMap.put(i, neighbours);
		}
		
		for ( int i =0; i < totalNoOfNodes; ++i) {
			nameToNodeMap.put(sc.next(), i);
		}
		
		

		while ( sc.hasNext() ) {

			String nameOne = sc.next();
			String nameTwo = sc.next();

			int source = nameToNodeMap.get(nameOne);
			nodeToNameMap.put(source, nameOne);
			int destination = nameToNodeMap.get(nameTwo);
			nodeToNameMap.put(destination, nameTwo);
			addEdges(source,nameOne, destination, nameTwo);


		}
		sc.close();

	}

	private void addEdges(int source,String nameOne, int destination,String nameTwo) {

		if ( source > adjacencyListMap.size() || destination > adjacencyListMap.size() ) {
			throw new IllegalArgumentException("Source/Destination Vertex invalid. Cannot add edge.");
		}

		(adjacencyListMap.get(source)).add(new Node(nameTwo,destination));
		if ( ! isDirected ) {
			(adjacencyListMap.get(destination)).add(new Node(nameOne,source));
		}

	}

	public int getIndexFromNames(String name ) {

		for ( int i =0; i < adjacencyListMap.size(); ++i ) {
			if ( adjacencyListMap.get(i).equals(name) ) {
				return i;
			}
		}
		return -1;

	}

	public ArrayList<Node> getAdjacentNodesOf(int source) {
		return adjacencyListMap.get(source);
	}

	public int getTotalNoOfNodesInGraph() {
		return totalNoOfNodes;
	}


}
