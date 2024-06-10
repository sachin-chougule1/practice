package practice;

public class Bubble_sort {
	
	// Bubble Sort 
	// Sort the array without using predefined method 
	// To find the second largest number from the Array 
	// Find largest from the Array 
	// Sort the Array in Ascending order  - smallest to largest
	// Sort the Atray in descending order -largest to smallest
	
	//1- Descending order // 99,32,11,9
	
	public void descendingOrder() {
		int [] arr = {11,15,45,2,56,950};
		int temp;
		
		for (int i=0; i<arr.length; i++) {
			
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]<arr[j]) {
					
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
				
			}
			System.out.println(arr[i]);
		}
		
		System.out.println(" ");
		System.out.println(arr[1]);
	}
	
	
//	2- assending order
	public void asceding_Order() {
		int [] arr = {11,15,45,2,56,950};
		int temp;
		
		for (int i=0; i<arr.length; i++) {
			
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
					
				}
				
			}
			System.out.println( arr[i]);
			
		}
		
		System.out.println(" ");
		System.out.println(arr[1]);
		
	}
	public static void main(String [] args) {
		
		Bubble_sort b = new Bubble_sort();
		b.descendingOrder();
//		b.asceding_Order();
	}

}
