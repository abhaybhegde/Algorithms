package strings;

import org.junit.Test;


import org.junit.Assert;


public class PalindromeCheckTest {
	
	@Test
	public void isPalindromeShouldReturnTrueWhenPalindromeStringIsPassed() {
		
		String inputString = "madam";
		Assert.assertTrue(PalindromeCheck.isPalindrome(inputString));
		
	}
	
	@Test
	public void isPalindromeShouldReturnFalseWhenNonPalindromeStringIsPassed() {
		
		String inputString = "github";
		Assert.assertFalse(PalindromeCheck.isPalindrome(inputString));
		
	}

	@Test
	public void isPalindromeShouldReturnFalseWhenEmptyStringIsPassed() {
		
		String inputString = "";
		Assert.assertFalse(PalindromeCheck.isPalindrome(inputString));
	}
	
	@Test
	public void isPalindromeShouldReturnTrue() {
		String inputString = "aabbbbaa";
		Assert.assertTrue(PalindromeCheck.isPalindrome(inputString));
		
	}
}
