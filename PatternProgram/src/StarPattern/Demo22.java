package StarPattern;

public class Demo22 {
	
public static void main(String[] args) {
		
	int line = 5;
	int starCount = 5;
     
	for(int i=1;i<=line;i++)
	{
		for(int j=1;j<=starCount;j++)
		{
			if(i==1 || i==line || j==1 || j==starCount)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	
	}

}
