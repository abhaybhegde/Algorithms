package strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordCountEngineTest {
	
	//Need to add more test cases
	
	@Test
	public void test() {
		String input = "Practice makes perfect. you'll only get Perfect by practice. just practice!";
		assertEquals("[practice=3, perfect=2, youll=1, get=1, by=1, makes=1, only=1, just=1]",WordCountEngine.wordCount(input).toString());
	}

}
