package StarPattern;
/*
 Pattern:-
*****
 ****
  ***
   **
    *
*/

public class Demo7 {

	public static void main(String[] args) {
		
			  System.out.println("Program Start");
			  int line=5;
			  int starCount=5;
			  int spaceCount=0;
			  
			  for(int i=1;i<=line;i++)
			  {
				  for(int j=1;j<=spaceCount;j++)
				  {
					  System.out.print(" ");
				  }
				  for(int k=1;k<=starCount;k++)
				  {
					  System.out.print("*");
				  }
				  System.out.println();
				  spaceCount++;
				  starCount--;
			  }
		    System.out.println("Program Ended");
			}

	}


