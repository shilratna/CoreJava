package numberPattern;
/*
11111
1   1
1   1
1   1
11111
*/

public class Demo5 {
	public static void main(String[] args) {
		
		int line = 5;
		int starCount = 5;
		int num = 1;
	     
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
				if(i==1 || i==line || j==1 || j==starCount)
				{
					System.out.print(num);
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
