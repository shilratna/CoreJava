package starLaterPattern;

public class Demo7 {
	
	public static void main(String[] args) {
		int line = 5;
		int mid =(line +1)/2;
		
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=line;j++)
			{
				if(i==1 || i==mid || i==line ||j==1)
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
