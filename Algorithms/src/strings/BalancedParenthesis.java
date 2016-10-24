package strings;

import java.util.Stack;

public class BalancedParenthesis {
	
	   public static boolean isParenthesisBalanced(String input) {
	       if ( input.length() == 0) {
	           return true;
	       }
	       
	       Stack<Character> stackOfParenthesis  = new Stack<Character>();
	       
	       for (int i=0;i<input.length();++i) {
	           char current = input.charAt(i);
	           
	           if ( current == '{' || current == '(' || current == '[') {
	               stackOfParenthesis.push(current);
	           }
	           
	           if ( current == '}' || current == ']' || current==')') {
	        	   
	        	   if ( stackOfParenthesis.isEmpty()) {
	        		   return false;
	        	   }
	               
	               char currentTop = stackOfParenthesis.peek();
	               if ( currentTop =='{') {
	                   if ( stackOfParenthesis.isEmpty()) {
	                       return false;
	                   }
	                   stackOfParenthesis.pop();
	               } else if (currentTop=='[') {
	                   if ( stackOfParenthesis.isEmpty()) {
	                       return false;
	                   }
	                   stackOfParenthesis.pop();
	               } else if (currentTop=='(') {
	                   if ( stackOfParenthesis.isEmpty()) {
	                       return false;
	                   }
	                   stackOfParenthesis.pop();                   
	               }
	           }
	        
	           
	           
	               
	       }
	       return stackOfParenthesis.isEmpty();
	   }



}
