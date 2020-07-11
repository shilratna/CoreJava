package HomeWork;
/*Write a Java program to generate 2 random numbers 
 * and identify which is larger and identify whether 
 * it is even or odd.*/

import java.util.Random;

public class RandomNumberEvenOddLarger {
	
	void EvenOddLarger()
	{
		Random r1 = new Random();
		int res1 =r1.nextInt(10000);
		int res2 =r1.nextInt(10000);
		
		if(res1 >= res1)
		{
			System.out.println(res1+" Number is larger");
			
			if(res1 % 2 !=0)
			{
				System.out.println(res1+" Number is odd ");
			}
			else
			{
				System.out.println(res1+" Number is even ");
			}
		}
		else 
		{
			System.out.println(res2+"Number is larger ");
			
			if(res2 % 2 !=0)
			{
				System.out.println(res2+" Number is odd ");
			}
			else
			{
				System.out.println(res2+" Number is even ");
			}
		}
	}

	public static void main(String[] args) {
		RandomNumberEvenOddLarger el1 = new RandomNumberEvenOddLarger();
		el1.EvenOddLarger();

	}

}
