package practice;

public class First_non_repetative_nuber_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {8,34,54,23,546,8};

		for(int i=0; i<a.length; i++) {
			int counter = 0;

			for (int j=0; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					counter=counter+1;
				}
			}
			if(counter==1) {
				System.out.println(a[i]);
				break;
				}
			
		}
		

	}

}
