package alphabetPattern;
/*A
 AAA
AAAAA
 AAA
  A*/

public class Demo12 {
	
	public static void main(String[] args) {
		
		System.out.println("program start..");
 		int line= 5;
 		int charCount = 1;
 		int spaceCount = 2;
 		char ch = 'A';
 		int mid =(line+1)/2;
 		
 		for(int i=1;i<=line;i++)
 		{
 			for(int k=1;k<=spaceCount;k++)
 			{
 				System.out.print(" ");
 			}
 			for(int j=1;j<=charCount;j++)
 			{
 				System.out.print(ch);	
 			}
 			for(int j=2;j<=charCount;j++)
 			{
 				System.out.print(ch);	
 			}
 			System.out.println();
 			if(i<mid) {
 			charCount++;
 			spaceCount--;
 			}
 			else {
 				charCount--;
 				spaceCount++;
 			}
 				
 		}
 		System.out.println("program end...");
        
	}

}
