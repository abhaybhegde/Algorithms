package strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlphabetRearrangementTest {
	
	@Test
	public void rearrangeAlphabetsShouldReturnElementsWithSpecifiedOrder() {
		
		assertEquals("[y, i, a, c, k, b, d, z]", AlphabetRearrangement.rearrangeAlphabets("a b c d k i z y", "3 6 4 7 5 2 8 1").toString());
		
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void rearrangeAlphabetsShouldThrowIllegalArgumentExceptionWhenInvalidInputIsPassed() {
		
		AlphabetRearrangement.rearrangeAlphabets("", "");
		
	}
	
	@Test
	public void rearrangeAlphabetsShouldReturnElementsWithSpecifiedOrderForLargeInput(){
		
		assertEquals("[c, a, z, d, j, m, o, w, e, r, t, u, i, p, s, f, g, h, q]", AlphabetRearrangement.rearrangeAlphabets("a z d e c j m o p w q e r t u i p s f g h k", "3 4 5 2 1 6 7 8 9 10 11"
				+ "12 13 14 15 16 17 18 19 20 21 22").toString() );
		
	}



}
