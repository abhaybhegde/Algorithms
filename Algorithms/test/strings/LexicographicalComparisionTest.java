package strings;

import org.junit.Test;
import org.junit.Assert;





public class LexicographicalComparisionTest {


	@Test  
	public void computeLengthOfIndividualStringsShouldReturnLengthOfTwoStrings() {

		String A = "abracadabra";
		String B = "poooof!";

		Assert.assertEquals(A.length()+B.length(), LexicographicComparision.computeLengthOfIndividualStrings(A, B));


	}
	
	@Test
	public void capitallizeShouldReturnTwoCapitalizedStrings() {
		String A = "abra";
		String B = "dabra";
		Assert.assertEquals("Abra Dabra", LexicographicComparision.capitailize(A, B));

	}
	
	@Test
	public void isLexicographicallyGreaterShouldReturnGreaterThanOne() {
		String A = "a";
		String B = "b";
		System.out.println(A.compareTo(B));

		
	}
}
