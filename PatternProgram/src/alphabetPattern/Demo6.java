package alphabetPattern;
/*
A
BB
CCC
DDDD
EEEEE 
 */

public class Demo6 {

	public static void main(String[] args) {
		
		System.out.println("program start..");
 		int line= 5;
 		int charCount = 1;
 		char ch = 'A';
 		
 		for(int i=1;i<=line;i++)
 		{
 			for(int j=1;j<=charCount;j++)
 			{
 				System.out.print(ch);	
 			}
 			System.out.println();
 			ch++;
 			charCount++;
 		}
 		System.out.println("program end...");
        

	}

}
