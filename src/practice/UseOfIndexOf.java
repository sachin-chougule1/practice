package practice;

public class UseOfIndexOf {

	 public static boolean isRotation(String str1,String str2)
	    {
	        if(str1.length()!=str2.length())
	        {
	            return false;
	        }
	        
	        String str3=str1+str1;   // ABCDABCD
	        
	        if(str3.indexOf(str2)!=-1)
	        {
	            return true;
	        }
	        
	        return false;
	    }
	    
	    public static void main(String[] args)
	    {
	        if(isRotation("ABCD","CDBA"))    // BCAD,ACDB
	        {
	            System.out.println("Rotation is available");
	        }
	        else
	        {
	            System.out.println("Rotation is not available");
	        }
	         
	    }


}
