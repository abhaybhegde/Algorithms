package strings.test;

import strings.*;

import org.junit.Test;
import org.junit.Assert;





public class LexicographicalComparisionTest {
	
	
	@Test
	public void computeLengthOfIndividualStringsShouldReturnLengthOfTwoStrings() {
		
		String A = "abracadabra";
		String B = "poooof!";
			
		Assert.assertEquals(A.length()+B.length(), LexicographicComparision.computeLengthOfIndividualStrings(A, B));
		
	
	}
	

}
