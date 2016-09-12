package strings.test;

import strings.Tokenizer;

import org.junit.Test;
import org.junit.Assert;


public class TokenizerTest {
	
	@Test
	public void tokenizerShouldPrintTokens() {
		
		String input = "Hi!, this is @Jim Gordon?'Hello";
		Tokenizer.tokenizer(input);
	}

}
