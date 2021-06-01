public class CommandLineArgs  {
	 public static void main(String args[]){
           if (args.length< 2 || args.length> 2) {
		System.out.println("Invalid no of arguments”+ “Supply exactly two arguments");
                  System.exit(0);
           }
	  System.out.println(args[0]+" "+args[1]); 
           int x=Integer.parseInt(args[0]);
           int y=Integer.parseInt(args[1]);
           System.out.println(x+y);
     }
}