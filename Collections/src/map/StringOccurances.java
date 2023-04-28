package map;

import java.util.HashMap;
import java.util.Map;

public class StringOccurances {

	public static void main(String[] args) {
		String str = "this is an awsome ocassion and this has never happened before";
		
	    Map<String, Integer> StringOccurances = new HashMap<>();
	    String[] words = str.split(" "); //used to identify all words
	    
	    //get the strings
	    //if that strings is there, we increment the count
	    //if that strings is not there, initialize it to 1  
	    
	    for(String word:words) {
	    	Integer integer = StringOccurances.get(word);
	    	if(integer == null) {
	    		StringOccurances.put(word, 1);
	    	}else {
	    		StringOccurances.put(word, integer + 1);
	    	}
	    }
	     System.out.println(StringOccurances);
		}		

	}

