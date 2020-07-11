package StarPattern;
/*
 **
 ***
 ****
 *****
 ******
*/

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("program started");
		String str ="*";
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(str);
			str = str + "*";
		}
		System.out.println("Program ended");

	}

}
