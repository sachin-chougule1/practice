package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_char_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbbccc";

		char[] ch_arr = str.toCharArray();
		
		Set<Character> obj = new LinkedHashSet<Character>();
		
		for(char ch:ch_arr) {
			obj.add(ch);
			
		}
		
		StringBuilder sb= new StringBuilder();
		
		for(Character charcter:obj) {
			sb.append(charcter);
			
		}

		String x = sb.toString();
		System.out.println(x);
	}

}
