package lab8;

public class o2 {
	public static void substrings(String var,int l) {
		System.out.println("Substrings of the string "+var+" are :");
		for (int i = 0; i < l; i++)  {
	           for (int j = i+1; j <= l; j++) {
	        	   System.out.println(var.substring(i, j));
			}
	}
	}
}
