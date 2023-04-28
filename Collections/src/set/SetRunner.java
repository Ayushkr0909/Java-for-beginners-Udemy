package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		//Set-Unique Elements
		//HashSet-Random positioning of Elements
		//LinkedHashSet-Elements positioning in order of insertion
		//TreeSet-Sorted positioning of Elements
		
		Set<Character> hashSet = new HashSet<>(characters);
		Set<Character> linkedhashSet = new LinkedHashSet<>(characters);	
		Set<Character> treeSet = new TreeSet<>(characters);
		
        System.out.println("hashSet: " + hashSet);
        System.out.println("linkedhashSet: " + linkedhashSet);
        System.out.println("treeSet: " + treeSet);

	}

}
