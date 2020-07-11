package alphabetPattern;
/*
  A
 AB
ABC
 AB
  A
 */

public class Demo10 {
	
	public static void main(String[] args) {
		System.out.println("Program start");
		int line = 5;
		int spaceCount = 2;
		int charCount =1;
		int mid =(5+1)/2;
		char ch='A';
		
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
				spaceCount--;
				charCount++;
			}
			else
			{
				spaceCount++;
				charCount--;
			}
			
		}
		System.out.println("Program ended");
	}

}
