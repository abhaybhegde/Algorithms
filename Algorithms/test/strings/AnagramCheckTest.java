package strings;

import strings.AnagramCheck;
import org.junit.Test;
import org.junit.Assert;

public class AnagramCheckTest {

	@Test
	public void isAnagramShouldReturnTrueForEmptyString() {
		String str1 ="",str2="";
		Assert.assertTrue(AnagramCheck.isAnagram(str1, str2));
	}

	@Test
	public void isAnagramShouldReturnTrueForAnagramStrings() {

		String str1 = "CAT";
		String str2 = "ACT";

		Assert.assertTrue(AnagramCheck.isAnagram(str1, str2));

	}

	@Test
	public void isAnagramShouldReturnFalseForNonAnagramStrings() {
		
		String str1 = "Hello";
		String str2 = "World";
		
		Assert.assertFalse(AnagramCheck.isAnagram(str1, str2));
	}

	@Test
	public void isAnagramShouldReturnTrueForLongAnagramStrings() {
		
		String str1 = "Narendra Modi";
		String str2 = "Married and No";
		
		Assert.assertTrue(AnagramCheck.isAnagram(str1, str2));
	}


}
