package alphabetPattern;
/*A
 A A
A   A
 A A
  A*/

public class Demo13 {
	
	public static void main(String[] args) {
		
		System.out.println("program start..");
 		int line= 5;
 		int charCount = 1;
 		int spaceCount = 2;
 		char ch = 'A';
 		int mid =(line+1)/2;
 		
 		for(int i=1;i<=line;i++)
 		{
 			for(int j=1;j<=spaceCount;j++)
 			{
            System.out.print(" ");
            }
 			for(int k=1;k<=charCount;k++)
 			{
 				if(i==1 || k==charCount)
 				{
 					System.out.print(ch);
 				}
 				else
 				{
 					System.out.print(" ");
 				}
 			}
 			System.out.println();
 			if(i<mid) {
 			charCount = charCount + 2;
 			spaceCount--;
 			}
 			else 
 			{
 				charCount =charCount - 2;
 				spaceCount++;
 			}
 				
 		}
 		System.out.println("program end...");
        
	}

}
