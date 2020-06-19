package StarPattern;

public class PatternAssignment1 {

	public static void main(String[] args) {
		
		System.out.println("Program Started ");
		int lineCount = 5;
		int starCount = 1;
		
		for(int i=1;i<=lineCount;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
			
			System.out.print("*");
		    }
		    System.out.println();
            starCount++;
            starCount++;
           }
		System.out.println("Program Ended");
	}
    
   }
