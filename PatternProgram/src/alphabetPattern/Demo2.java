package alphabetPattern;
/*
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 */

public class Demo2 {
	
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
 				ch++;
 			}
 			System.out.println();
 			ch = 'A';
 		}
 		System.out.println("program end...");
 	}

}


