package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EqualList {

	public static void main(String [] args) {

//		List<Integer> list1=new ArrayList<Integer>();       
        // List<Object> li1=new ArrayList<Object>();
        // List<String> li2=new ArrayList<String>();

		
		List<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(91);
		li.add(910);
		li.add(13);
		
		List<Object> ob = new ArrayList<Object>();
		ob.add(12);
		ob.add(91);
		ob.add(910);
		ob.add(13);
		
		boolean value = Objects.equals(li, ob);
		if(value) {
            System.out.println("Lists are equals");

		}
		else {
            System.out.println("gien list are not equal");

		}
		
	}
	
}
