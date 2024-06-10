package practice;

public class repeted_charset_count_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "test1test2test3test4";
	int	counter = 0;
		
		String[] str_arr = str.split("[0-9]");
		
		int a = str_arr.length;
//		System.out.println(a);
		
		for(int i=0; i<str_arr.length; i++) {
			if(str_arr[i].equals("test")) {
				counter++;
				
			}
		}
		System.out.println(counter);

	}

}
