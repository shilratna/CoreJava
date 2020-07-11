package StarPattern;
/*
   *    *
   **  **
   ******
   **  ** 
   *    *
  */

public class PatternAssignment6 {

	public static void main(String[] args) {
		System.out.println("program satrted...");
		int lineCount = 5;
		int spaceCount = 4;
		int starCount = 1;
		int mid =(lineCount +1)/2;
		
		
		
		for(int i=1;i<=lineCount;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=starCount;l++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
				starCount++;
				spaceCount = spaceCount - 2;
				
			}
			else
			{
				starCount--;
				spaceCount = spaceCount + 2;
				
			}
			
		}
		System.out.println("Program Ended...");

	}

}
