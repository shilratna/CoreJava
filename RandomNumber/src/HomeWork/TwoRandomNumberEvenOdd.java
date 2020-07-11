package HomeWork;

import java.util.Random;

public class TwoRandomNumberEvenOdd {
	
	void TwoEvenOdd()
	{
		Random r1 = new Random();
		int res1 =r1.nextInt(10000);
		int res2 =r1.nextInt(10000);
		
		if(res1 % 2 != 0)
		{
			System.out.println(res1+" Number is odd");
		
		}
		else
		{
			System.out.println(res1+" Number is even");
		}
		
		if(res2 % 2 != 0)
		{
			System.out.println(res2+" Number is odd");
		}
		else
		{
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		TwoRandomNumberEvenOdd t1 = new TwoRandomNumberEvenOdd();
		t1.TwoEvenOdd();

	}

}
