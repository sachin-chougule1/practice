package practice;

public class Factorial_WithOut_recorsiveMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact =1;
		int num = 5;
		for (int i = num; i>=1; i--) {
			fact= fact+num;
			num= num-1;
		}
		System.out.println(fact);

	}

}
