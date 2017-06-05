package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

/*
 * Given an input string, your algorithm should return the individual count of each word in descending
 * order
 *
 */

/* Clauses
 * ===> Algorithms should strip out all punctuation even in middle of the word
 * ===> Algorithm should be case in-sensitive
 * ===> Count should be returned in descending order
 */

/* Example:
 * Input - "Practice makes perfect. you'll only get Perfect by practice. just practice!"
 * Output - "practice", "3"
 * 			"perfect", "2"
 * 			"makes", "1"
 * 			"get", "1"
 * 			"by", "1"
 * 			"just", "1"
 * 			"youll", "1"	
 * 			"only", "1"
 */

/*
 * Constraints - All characters are english alphabets
 * Input size can be <=10000
 */



/* Approach
 * Idea is to construct a hash table where key is the individual word and value as its occurrence
 * 1) Parse the input string using a regex to filter out punctuation ( takes O(n) time )
 * 2) Split the input string using space as a delimiter
 * 3) Scan each word , if occurence is 0 , increment the count by one, else add the word to hash table and increment the count
 * 
 */



public class WordCountEngine {
	
	private static final Pattern PUNCTUATION = Pattern.compile("[';:,!?\"]");
	
	public static List<Entry<String,Integer>> wordCount(String input) {
		
		Map<String,Integer> wordCount = new HashMap<>();
		String parserdString = PUNCTUATION.matcher(input).replaceAll("").toLowerCase();
		String [] inputWords = parserdString.replace(".", " ").split("\\s+");
		
		Integer count;
		for (String eachWord : inputWords) {
			if ( wordCount.get(eachWord) == null ) {
				count=0;
				wordCount.put(eachWord, ++count);
			} else {
				wordCount.put(eachWord, wordCount.get(eachWord) + 1);
			}
			
		}
		
		Set<Entry<String,Integer>> set = wordCount.entrySet();
		List<Entry<String,Integer>> sortedResultList = new ArrayList<Entry<String,Integer>>(set);
		
		Collections.sort(sortedResultList,new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		return sortedResultList;
	}

}
