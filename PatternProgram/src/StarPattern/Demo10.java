package StarPattern;
/*
      *
      * *
      * * *
      * *
      * 
 */

public class Demo10 {

	public static void main(String[] args) {
		
		System.out.println("Start Program");
		int i;
		int lineCount = 5;
		int starCount = 1;
		int mid = (lineCount+1)/2;
		
		for(i=1;i<=lineCount;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
			System.out.print("*");
			}
			
			System.out.println();
			if(i<mid)
			{
				starCount++;
			}
			else
			{
				starCount--;
			}
		}
		
       System.out.println("Program Ended");
	}
}
