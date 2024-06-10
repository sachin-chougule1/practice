package practice;

public class CommonFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {26,18,10,3};
		int [] b = {26,56,8,3,75};
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {
				if(a[i]== b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
