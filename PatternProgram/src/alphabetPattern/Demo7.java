package alphabetPattern;
/*A
  AB
  ABC
  ABCD
  ABCDE
  */

public class Demo7 {
	
	public static void main(String[] args) 
	{
		System.out.println("program start..");
 		int line= 5;
 		int charCount = 1;
 		char ch = 'A';
 		
 		for(int i=1;i<=line;i++)
 		{
 			for(int j=1;j<=charCount;j++)
 			{
 				System.out.print(ch);	
 				ch++;
 			}
 			System.out.println();
 			ch='A';
 			charCount++;
 		}
 		System.out.println("program end...");
        
	}

}
