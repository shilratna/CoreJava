package alphabetPattern;
/*
  A
 A C
A   E
 A C
  A
 */

public class Demo15 {
	
	public static void main(String[] args) {
		
		System.out.println("Program Start");
		int line =5;
		int spaceCount=2;
		int charCount=1;
		int mid = (line+1)/2;
		char ch = 'A';
		
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=spaceCount;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=charCount;k++)
			{
				if(k==1 || k==charCount)
				{
				System.out.print(ch);
				ch++;
				
				}
				else
				{
				System.out.print(" ");
				ch++;
				
				}
			}
			ch='A';
			System.out.println();
			if(i<mid)
			{
				charCount=charCount+2;
				spaceCount--;
			}
			else
			{
				charCount=charCount-2;
				spaceCount++;
			}
			
		}
		System.out.println("Program Ended");
	}

}
