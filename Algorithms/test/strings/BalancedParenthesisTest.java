package strings;

import static org.junit.Assert.*;

import org.junit.Test;

import strings.BalancedParenthesis;

public class BalancedParenthesisTest {
	
	@Test
	public void isParenthesisBalancedShouldReturnTrue() {
		assertEquals(true, BalancedParenthesis.isParenthesisBalanced("({(){}()})()({(){}()})(){()}"));
		assertEquals(true, BalancedParenthesis.isParenthesisBalanced("[]{}(){()}((())){{{}}}{()()}{{}{}}"));
		assertEquals(true, BalancedParenthesis.isParenthesisBalanced("[[]][][]"));
		assertEquals(true, BalancedParenthesis.isParenthesisBalanced(""));
		
	}
	
	@Test
	public void isParenthesisBalancedShouldReturnFalse() {
		assertEquals(false, BalancedParenthesis.isParenthesisBalanced("(({()})))"));
		assertEquals(false, BalancedParenthesis.isParenthesisBalanced("{}()))(()()({}}{}"));
		assertEquals(false, BalancedParenthesis.isParenthesisBalanced("((("));
		assertEquals(false, BalancedParenthesis.isParenthesisBalanced(")))"));
		assertEquals(false, BalancedParenthesis.isParenthesisBalanced("{{{{)"));
		assertEquals(false, BalancedParenthesis.isParenthesisBalanced("[[[[[)"));
	}

}
