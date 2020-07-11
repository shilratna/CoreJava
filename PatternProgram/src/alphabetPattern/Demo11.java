package alphabetPattern;
/*
A
AB
ABC
AB
A
 */
public class Demo11 {
	
	public static void main(String[] args) {
		
		System.out.println("Program start");
		int line=5;
		int charCount=1;
		char ch = 'A';
		int mid =(line+1)/2;
		
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=charCount;j++)
			{
				System.out.print(ch);
				ch++;
			}
			ch='A';
			System.out.println();
			if(i < mid)
			{
			charCount++;
			}
			else
			{
				charCount--;
			}
		}
		System.out.println("Program ended");
	}

}
