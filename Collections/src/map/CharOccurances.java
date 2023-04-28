package map;

import java.util.HashMap;
import java.util.Map;

public class CharOccurances {

	public static void main(String[] args) {
		String str = "This is an awsome ocassion. This has never happened before.";
		
    Map<Character, Integer> charOccurances = new HashMap<>();
    char[] characters = str.toCharArray(); //used to identify all the characters in the string
    
    //get the character
    //if that character is there, we increment the count
    //if that character is not there, initialize it to 1  
    
    for(char character:characters) {
    	Integer integer = charOccurances.get(character);
    	if(integer == null) {
    		charOccurances.put(character, 1);
    	}else {
    		charOccurances.put(character, integer + 1);
    	}
    }
     System.out.println(charOccurances);
	}

}
