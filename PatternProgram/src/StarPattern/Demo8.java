package StarPattern;
/* 
       *
      ***
     *****
    *******
   ********* 
 */

public class Demo8 {

	public static void main(String[] args) {
		System.out.println("Program Started..");
		int lineCount = 5;
		int spaceCount = 4;
		int starCount = 1;
		
		for(int i = 1;i <=lineCount;i++)
		{
			for(int j=1;j<=spaceCount;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=starCount;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaceCount--;
			starCount = starCount + 2;
			
		}
		
     System.out.println("Program Ended...");
	}
	

}
