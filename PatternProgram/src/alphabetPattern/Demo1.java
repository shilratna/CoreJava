package alphabetPattern;
/*
 AAAAA
 AAAAA
 AAAAA
 AAAAA
 AAAAA
  */

public class Demo1 {
	
	public static void main(String[] args) {
		
		System.out.println("program start..");
		int line= 5;
		int charCount = 5;
		char ch = 'A';
		
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=charCount;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		System.out.println("program end...");
	}

}
