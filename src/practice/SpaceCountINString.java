package practice;

public class SpaceCountINString {

	public static void main(String[] args) {

        String s="  Vince Victor John  ";

       int sLength = s.length();
       
      String s2 = s.replaceAll(" ", "");
      int s2Length = s2.length();
    
      int op = sLength-s2Length;
      System.out.println("count of space is : " +op);

	
	}

}
