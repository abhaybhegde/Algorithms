package graphs;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;

public class CycleCheckTest {
	
	@Test
	public void test_isCyclicShouldReturnTrueWhenACyclicGraphIsPassed() throws FileNotFoundException {

			CycleCheck testGraph = new CycleCheck(3);
			testGraph.addEdges(0, 1);
			testGraph.addEdges(1, 2);
			testGraph.addEdges(2, 0);
			assertTrue(testGraph.hasCycle(testGraph));
			
	}
	
	@Test
	public void test_isCyclicShouldReturnFalseWhenNonCyclicGraphIsPassed() throws FileNotFoundException {

			CycleCheck testGraph = new CycleCheck(3);
			testGraph.addEdges(0, 1);
			testGraph.addEdges(1, 2);
			assertFalse(testGraph.hasCycle(testGraph));
			
	}
	

}
