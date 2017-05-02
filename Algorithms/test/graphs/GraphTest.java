package graphs;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GraphTest {
	
	@Test
	public void test_getAdjacentNodesOfShouldReturnListOfAdjacentNodesWhenANodeIsPassed() throws FileNotFoundException{
		
		Graph testGraph = new Graph("graph_input.txt");
		ArrayList<Node> actual = testGraph.getAdjacentNodesOf(1);
		assertEquals("Sara", actual.get(0).nodeData);
		assertEquals("Sean", actual.get(1).nodeData);
		assertEquals("Mira", actual.get(2).nodeData);

	}
	
	
	
	

}
