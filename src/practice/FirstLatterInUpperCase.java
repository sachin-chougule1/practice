package practice;

public class FirstLatterInUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String s="i am an automation test engineer";

        // output : I am An Automation Test Engineer

        
       String[] arr = s.split(" ");
       
       // arr = [i am an automation test engineer]
       // char[] ch=string.toCharArray();
       // Character.toUpperCase(char) >> char - Character which we want to
       // convert into uppercase
       

       for(int i=0; i<arr.length; i++) {
    	   
    	  char[] ch = arr[i].toCharArray();
    	  
    	  for(int j= 0; j<ch.length; j++) {
    		  
    		 ch[0] = Character.toUpperCase(ch[0]);
    		 
    		 System.out.print(ch[j]);
    	  }
    	  System.out.print(" ");
       }
        
        
	}

}
