package alphabetPattern;

public class Demo17 {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		int line=5;
		int spaceCount=2;
		int charCount=1;
		int mid=(line+1)/2;
		char ch='A';
		
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=charCount;j++)
			{
				System.out.print(ch);
			}
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=charCount;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			if(i<mid)
			{
			charCount++;
			spaceCount--;
			}
			else
			{
				charCount--;
				spaceCount++;
			}
		}
		System.out.println("Program Ended");

	}

}
