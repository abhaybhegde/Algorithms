package strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNonRepeatedCharacterTest {
	
	// Need to add more test cases

	@Test
	public void firstNonRepeatedCharacter() {
		
		assertEquals((Character)'b', FirstNonRepeatedCharacter.firstNonRepeatedCharacter("aab"));
	}
	
	
	@Test
	public void firstNonRepeatedCharacterWithNoRepeatedCharacter() {
		
		assertEquals((Character)'a', FirstNonRepeatedCharacter.firstNonRepeatedCharacter("abc"));
	}


	@Test(expected=NullPointerException.class)
	public void null_test_firstNonRepeatedCharacter() {
		
		FirstNonRepeatedCharacter.firstNonRepeatedCharacter(null);
	}

}
