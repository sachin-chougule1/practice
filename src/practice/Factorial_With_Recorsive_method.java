package practice;

public class Factorial_With_Recorsive_method {
	
	public static int fact(int num) {
		if(num>1) {
			return num*fact(num-1);
		}
		
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		System.out.println(fact(num));
	}

}
