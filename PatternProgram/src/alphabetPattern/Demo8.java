package alphabetPattern;
/*
A
AA
AAA
AA
A
*/

public class Demo8 {
	
	public static void main(String[] args) {
		
		System.out.println("program start..");
 		int line= 5;
 		int charCount = 1;
 		char ch = 'A';
 		int mid =(line+1)/2;
 		
 		for(int i=1;i<=line;i++)
 		{
 			for(int j=1;j<=charCount;j++)
 			{
 				System.out.print(ch);	
 			}
 			System.out.println();
 			if(i<mid) {
 			charCount++;
 			}
 			else {
 				charCount--;
 			}
 				
 		}
 		System.out.println("program end...");
        
	}

}
