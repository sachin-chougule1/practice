package practice;

import java.util.HashMap;

public class CountOfTheWord {

	public static void main(String[] args) {

        String str="I am an introvert person I am";

       String[] s = str.split(" ");
       
    // as argument this method takes regular expression

       
       HashMap <String, Integer> m = new HashMap<String,Integer>();
       
       for(String word:s) {
    	   
    	   if(m.containsKey(word)) {
    		   
    		   m.put(word, m.get(word)+1);
    		   
    	   }
    	   else {
    		   m.put(word,1);
    		   
    	   }
       }
	   System.out.println(m);

       
	}

}
