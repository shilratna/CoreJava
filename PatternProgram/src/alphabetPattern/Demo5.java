package alphabetPattern;
/*
EDCBA
E   A
E   A
E   A
EDCBA
 */

public class Demo5 {

	public static void main(String[] args) {
		
		System.out.println("program start..");
 		int line= 5;
 		int charCount = 5;
 		char ch = 'E';
 		
 		for(int i=1;i<=line;i++)
 		{
 			for(int j=1;j<=charCount;j++)
 			{
 				if(j==1||j==charCount||i==1||i==line)
 				{
 					System.out.print(ch);
 				}
 				else
 				{
 				System.out.print(" ");	
 				}
 				ch--;	
 			}
 			System.out.println();
 			ch = 'E';
 		}
 		System.out.println("program end...");


	}

}
