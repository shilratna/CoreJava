package StarPattern;
/*
 *****
 ****
 ***
 **
 *
  */

public class Demo5 {
	
	public static void main(String[] args) {
		System.out.println("Program started");
		int starCount =5;
		int lineCount = 5;
		
		for(int i=1; i<=lineCount;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starCount--;
			
		}
		System.out.println("Program ended");
	}

}
