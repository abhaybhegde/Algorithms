package graphs;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class DepthFirstSearchRecursiveImplTest {
	
	Graph testGraph;

	@Before
	public void initializeTestGraph() throws FileNotFoundException {
		testGraph = new Graph("recursive_dfs.txt");
		
	}
	
	@Test
	public void testRecursiveDfs() {
		DepthFirstSearchRecursiveImpl test = new DepthFirstSearchRecursiveImpl(testGraph, 0);
		test.recursiveDepthFirstSearch(testGraph, 0);
		
	}
}
