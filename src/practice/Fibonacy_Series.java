package practice;

public class Fibonacy_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0,1,1,2,3,5,8,13....
		
		int num1=0;
		int num2=1;
		int num3;
		int count = 5;
		
		System.out.print(num1 + " "+ num2 +" ");

		for(int i=0;i<count-2; i++) {
			num3=num1+num2;
			System.out.print(num3+" ");;
			
			num1=num2;
			num2=num3;
			
		}
		
	}

}
