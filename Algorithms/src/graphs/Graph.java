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

		isDirected = "directed".equals(orientation);

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

	public Graph(String[] names,String[][] edges){
		int numberOfNodes = names.length;
		this.totalNoOfNodes = numberOfNodes;
		adjacencyListMap = new HashMap<Integer,ArrayList<Node>>();
		nameToNodeMap = new HashMap<String,Integer>();
		nodeToNameMap = new HashMap<Integer,String>();	

		for(int i=0;i<totalNoOfNodes;i++){
			adjacencyListMap.put(i, new ArrayList<Node>());
		}

		for(int i=0;i<totalNoOfNodes;i++){
			nameToNodeMap.put(names[i],i);
			nodeToNameMap.put(i,names[i]);
		}
		for(int i=0;i<edges.length;i++){
			if(edges[i].length!=2)throw new IllegalArgumentException("arg[1]'s size not conformed!");
			String nameOne = edges[i][0];
			String nameTwo = edges[i][1];
			if(!nameToNodeMap.containsKey(nameOne) || !nameToNodeMap.containsKey(nameTwo))throw new IllegalArgumentException("Nodes not found in graph!");
			int source = nameToNodeMap.get(nameOne);
			int destination = nameToNodeMap.get(nameTwo);
			addEdges(source, nameOne, destination, nameTwo);
		}
		
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
			if (nameToNodeMap.containsKey(name) ) {
				return  nameToNodeMap.get(name);
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
