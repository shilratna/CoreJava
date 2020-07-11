package alphabetPattern;
/*
 A
 ABC
ABCDE
 ABC
  A
 */

public class Demo14 {
	
	public static void main(String[] args) {
		
		System.out.println("program started");
		int line=5;
		int spaceCount=2;
		int charCount =1;
		char ch='A';
		int mid =(line+1)/2;
		
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=spaceCount;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=charCount;k++)
			{
				System.out.print(ch);
				ch++;
			}
			ch ='A';
			System.out.println();
			if(i<mid)
			{
				charCount = charCount + 2;
				spaceCount--;
			}
			else
			{
				charCount = charCount - 2;
				spaceCount++;
			}
		}
		System.out.println("Program Ended");
	}

}
