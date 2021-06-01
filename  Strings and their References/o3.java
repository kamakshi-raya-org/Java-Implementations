package lab8;

public class o3 {
	public static void capitalize(String var) {
		String[] var1=var.split(" ");
		for(int i=0; i<var1.length;i++) {
			var1[i]=var1[i].substring(0, 1).toUpperCase()+var1[i].substring(1,var1[i].length()).toLowerCase();
			System.out.print(var1[i]+" ");
		}
		
	}

}
