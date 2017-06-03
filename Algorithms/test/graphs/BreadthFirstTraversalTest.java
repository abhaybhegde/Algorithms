package graphs;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.*;

public class BreadthFirstTraversalTest {
	
	Graph testGraph;

	@Before
	public void initializeTestGraph() throws FileNotFoundException {
		testGraph = new Graph("breadth_first_traversal.txt");
	}
	
	
	@Test
	public void test_isReachable( ) {
		 int source = 0 ;
		 int destination = 4;
		 BreadthFirstTraversal bfsGraph = new BreadthFirstTraversal(testGraph);
		 assertEquals(false,bfsGraph.isReachable(testGraph, source, destination));
		 
		 
	}

}
