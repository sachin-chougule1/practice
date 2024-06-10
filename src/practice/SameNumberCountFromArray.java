package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SameNumberCountFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {6,2,7,3,4,6,23,65,3,45};
		
		List<Integer> l1= new ArrayList<Integer>();
		
		HashMap<Integer,Integer> m =  new HashMap<Integer,Integer>();
		
		for (int i:a){
			
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}
			
			else {
				m.put(i, 1);
			}
			
			
		}
		System.out.println(m);

		

	}

}
