package strings;

import org.junit.Test;

import strings.Tokenizer;


public class TokenizerTest {
	
	@Test
	public void tokenizerShouldPrintTokens() {
		
		String input = "Hi!, this is @Jim Gordon?'Hello";
		Tokenizer.tokenizer(input);
	}

}
