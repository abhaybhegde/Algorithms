package strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordCountEngineTest {
	
	//Need to add more test cases
	
	@Test
	public void test_with_small_input() {
		String input = "Practice makes perfect. you'll only get Perfect by practice. just practice!";
		assertEquals("[practice=3, perfect=2, youll=1, get=1, by=1, makes=1, only=1, just=1]",WordCountEngine.wordCount(input).toString());
	}
	
	@Test(expected = NullPointerException.class)
	public void test_with_emptyString() {
		String input = null;
		WordCountEngine.wordCount(input);
	}
	
	
	@Test
	public void wordCountShouldReturnSortedOrderForLargeSentences() {
		String input = "First_Person: Hi there!, How have you been?.It's been a long time "
				+ "Second_Person: Yeah it's been a long long time! let's catch up!";
		String expected = "[been=3, long=3, a=2, its=2, time=2, hi=1, first_person=1, lets=1, yeah=1, second_person=1, how=1, there=1, have=1, catch=1, up=1, you=1]";
		assertEquals(expected,WordCountEngine.wordCount(input).toString());
	}

}
