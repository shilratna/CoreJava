package StarPattern;
/*
     *
   * *
 * * *
   * *
     *
 */

public class Demo11 {

	public static void main(String[] args) {


		System.out.println("Start Program");
		int i;
		int lineCount = 5;
		int starCount = 1;
		int spaceCount = 2;
		int mid = (lineCount+1)/2;
		
		for(i=1;i<=lineCount;i++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=starCount;j++)
			{
			System.out.print("*");
			}
			
			
			System.out.println();
			if(i<mid)
			{
				starCount++;
				spaceCount--;
			}
			else
			{
				starCount--;
				spaceCount++;
			}
		}
		
       System.out.println("Program Ended");
	}


}
