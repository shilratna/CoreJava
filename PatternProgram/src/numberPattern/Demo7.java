package numberPattern;
/*
54321
5   1
5   1
5   1
54321
*/

public class Demo7 {
public static void main(String[] args) {
		
		int line = 5;
		int starCount = 5;
		int num = 5;
	     
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
				if(i==1 || i==line || j==1 || j==starCount)
				{
					System.out.print(num);
					num--;
				}
				else
				{
					System.out.print(" ");
					num--;
				}
				
			}
			num =5;
			System.out.println();
		}
		
		}

}

