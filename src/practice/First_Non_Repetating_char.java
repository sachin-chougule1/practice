package practice;

public class First_Non_Repetating_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="dhfdkjasfkajyh";
		
		char [] ch_arr = str.toCharArray();
		
		 // indexOf(char) >> index of first occurence of the character 
        // lastIndexOf(char) >> index of last occurent of the character 
        
       // for..each loop 

		for(char ch:ch_arr) {
			
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				
				System.out.println("first non-repeated character "+ch);
	               break;
			}
			
		}
	}

}
