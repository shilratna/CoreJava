package StarPattern;
/*
   *  *
   ** **
   * ** *
   ** ** 
   *  *
 */

public class Demo18 {

	public static void main(String[] args) {
		
		System.out.println("program satrted...");
		int lineCount = 5;
		int spaceCount = 2;
		int starCount = 1;
		int mid =(lineCount +1)/2;
		
		
		
		for(int i=1;i<=lineCount;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
				if(j==1 || j==starCount)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=starCount;j++)
			{
				if(j==1 || j==starCount)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
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
		System.out.println("Program Ended...");

	}

   
}	
	

