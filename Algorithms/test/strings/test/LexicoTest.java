package strings.test;

import strings.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;

public class LexicoTest {
	
	@Test
	public void computeSubstringShouldReturnListOfAllIndividualStrings() {
		
		String inputString = "abracadabra";
		int subStrLength  = 5;
		List<String> expected = new ArrayList<String>();
		expected.add("abrac");
		expected.add("braca");
		expected.add("racad");
		expected.add("acada");
		expected.add("cadab");
		expected.add("adabr");
		expected.add("dabra");
		
		Assert.assertEquals(expected, Lexico.computeSubstring(inputString, subStrLength));
	}
	
	@Ignore
	@Test
	(expected=java.lang.StringIndexOutOfBoundsException.class)
	public void computeSubstringShouldReturnListOfStrings() {
		
		String inputString = "";
		int subStrLength  = 5;
		List<String> expected = new ArrayList<String>();
		expected.add("abrac");
		expected.add("braca");
		expected.add("racad");
		expected.add("acada");
		expected.add("cadab");
		expected.add("adabr");
		expected.add("dabra");
		
		Lexico.computeSubstring(inputString, subStrLength);
	}
	
	@Test
	public void TestComputeSubstringWithSpaces() {
		
		String inputString = "abra cada bra";
		int subStrLength  = 5;
		String expected = "[abra , bra c, ra ca, a cad,  cada, cada , ada b, da br, a bra]";
		Assert.assertEquals(expected, Lexico.computeSubstring(inputString, subStrLength).toString());
	}

	@Test
	public void returnSmallestShouldReturnLexicallySmallestSubstring() {
		
		List<String> input = new ArrayList<String>();
		input.add("Wel");
		input.add("elc");
		input.add("Aaa");
		input.add("Zzz");
		input.add("zzz");
		
		Assert.assertEquals("Aaa", Lexico.returnSmallest(input));
	
	}
	
	@Test
	public void returnLargestShouldReturnLexicallyLargestSubstring() {
		
		List<String> input = new ArrayList<String>();
		input.add("Wel");
		input.add("elc");
		input.add("Aaa");
		input.add("Zzz");
		input.add("zzz");
		
		Assert.assertEquals("zzz", Lexico.returnLargest(input));
		
	}

}
