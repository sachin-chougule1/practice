package practice;

import java.util.HashMap;

public class CharacterCountFromString {
	
	public static void main (String [] args) {
		
		String str = "vainceaheeeevvvaa";
		
		char[] str1 = str.toCharArray();
		
		HashMap <Character,Integer> m = new HashMap<Character, Integer>();
		
		
		for(char ch : str1) {
			
			if(m.containsKey(ch)) {

				m.put(ch,m.get(ch)+1);

				
			}
			else {

				m.put(ch,1);
			
			}
	
		}
		System.out.println(m);

		
	}

}
