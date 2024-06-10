package practice;

public class Tryandcatch {
	public static void main(String [] args) {
	
		try {
			int a [] = new int[3]; // 3 is Defined Capacity of array

			a[2]=10;
			System.out.println("try block");
			
		}
		
		
	catch(ArrayIndexOutOfBoundsException e) {
				
		System.out.println("Index value is not correct");
//		System.exit(0);  // finally block will not execute because of this
	}
		catch(Exception e) {
			System.out.println("final exception");

		}

	
	finally {

		System.out.println("finalally block");
		
	}
	}
}
