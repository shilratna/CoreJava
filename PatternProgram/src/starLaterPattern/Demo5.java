package starLaterPattern;

public class Demo5 {

	public static void main(String[] args) {
	   int line = 5;
	   
	   for(int i=1;i<=line;i++)
	   {
		   for(int j=1;j<=line;j++)
		   {
			   if(j==1 || j==line)
			   {
			       System.out.print("*");
			   }
			   else
			   {
				   System.out.print(" ");
			   }
		   }
		   
		  System.out.println();
	   }

	}

}
