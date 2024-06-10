package practice;

public class RegularExpression {
	public static void main(String [] args) {


		// regex: \\W+ >> This will represent the special characters 
        // regex: \\w+ >> This will represent the alphanumeric 
        // regex: [0-9] >> All the numbers between 0-9
        // regex: [a-zA-Z] >> all the characters/alphabets  
        // regex : [^0-9] >> Except the 0-9 
        
        String str1="I@ am an au@tomation e$ngi!nee&&&r";
        String str2="I2 !am a10n intr1#11ove??rt";
        
        String new_str1=str1.replaceAll("\\W+","");
         String new_str2=str2.replaceAll("\\w+","");
         
         System.out.println(new_str1);
         System.out.println(new_str2);

	}

}
