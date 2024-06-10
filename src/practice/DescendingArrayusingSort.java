package practice;

import java.util.Arrays;
import java.util.Collections;

public class DescendingArrayusingSort {

	public static void main(String [] args) {
		
		int [] b = {7,1,290,36,27,45,78,34,67};
//		 Arrays.sort(b,Collections.reverseOrder());
		Arrays.sort(b);
		for(int i=b.length-1; i>=0; i--)
		{
			System.out.println(b[i]+ " ");
		}
	}
}
